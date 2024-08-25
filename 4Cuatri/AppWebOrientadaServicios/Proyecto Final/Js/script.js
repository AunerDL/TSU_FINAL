document.getElementById('btnImprimir').addEventListener('click', function () {
  // Realizar una solicitud AJAX para obtener datos del servidor
  buscarPersona();
  imprimir();
});

function buscarPersona() {
  var idPersona = document.getElementById('inputIdPersona').value;

  // Realizar una solicitud Fetch a tu API
  fetch('https://localhost:44376/api/personas/consultar/' + idPersona)
  .then(response => {
      console.log('Respuesta de la API:', response);
      return response.json();
  })
  .then(datos => mostrarDatos(datos))
  .catch(error => {
      console.error('Error al buscar persona:', error);
  });
}

function mostrarDatos(datos) {
  // Verificar si hay direcciones disponibles
  if (datos.direcciones && datos.direcciones.length > 0) {
      // Crear una tabla HTML para mostrar los datos de las direcciones
      var tablaHTML = '<table border="1">';
      tablaHTML += '<tr><th>Calle</th><th>Colonia</th><th>Código Postal</th><th>Número Interior</th><th>Número Exterior</th><th>Municipio</th></tr>';

      // Iterar sobre las direcciones y agregar filas a la tabla
      datos.direcciones.forEach(function(direccion) {
          tablaHTML += '<tr>';
          tablaHTML += '<td>' + direccion.calle + '</td>';
          tablaHTML += '<td>' + direccion.colonia + '</td>';
          tablaHTML += '<td>' + direccion.codigo_postal + '</td>';
          tablaHTML += '<td>' + direccion.numero_interior + '</td>';
          tablaHTML += '<td>' + direccion.numero_exterior + '</td>';
          tablaHTML += '<td>' + direccion.municipio + '</td>';
          tablaHTML += '</tr>';
      });

      // Cerrar la tabla
      tablaHTML += '</table>';

      // Insertar la tabla en el contenedor deseado (ajusta esto según tu estructura HTML)
      var datosContainer = document.getElementById('datosContainer');
      datosContainer.innerHTML = '<div id="datosNoTabla">' +
          '<p>Nombre: ' + datos.nombre + '</p>' +
          '<p>Apellido Paterno: ' + datos.apellido_paterno + '</p>' +
          '<p>Apellido Materno: ' + datos.apellido_materno + '</p>' +
          '<p>RFC: ' + datos.rfc + '</p>' +
          '<p>Edad: ' + datos.edad + '</p>' +
          '<p>Teléfono Celular: ' + datos.telefonos.telefono_celular + '</p>' +
          '<p>Teléfono Casa: ' + datos.telefonos.telefono_casa + '</p>' +
          '<p>Fax: ' + datos.telefonos.fax + '</p>' +
          '</div>' +
          tablaHTML;
  } else {
      // Mostrar un mensaje si no hay direcciones disponibles
      var mensaje = 'No hay direcciones disponibles para mostrar.';
      console.log(mensaje);
      // Puedes ajustar esto según tu estructura HTML
      var datosContainer = document.getElementById('datosContainer');
      datosContainer.innerHTML = mensaje;
  }
}

function imprimir() {
  window.print();
}



