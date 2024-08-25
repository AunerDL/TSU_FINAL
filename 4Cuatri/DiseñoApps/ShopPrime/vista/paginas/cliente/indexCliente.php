<?php
session_start();
if (isset($_SESSION['usuarioValido'])) {
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>indexCliente</title>

    <link rel="stylesheet" href="../../../vista/css/estiloIndex.css">
    <link rel="stylesheet" href="../../../vista/css/estiloMenu.css">

    <!-- Latest compiled and minified CSS 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
   -->
    <link rel="stylesheet" href="../../../vista/vendor/bootstrap-5.2.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../vista/vendor/fontawesome-free-6.4.0-web/css/all.css">
    <script src="../../../vista/vendor/bootstrap-5.2.3-dist/js/bootstrap.bundle.js"></script>
</head>

<body>
    <div id="contenedor">
        <!--Encabezado -->
        <header class="container-fluid bg-dark text-white text-center pt-3">
            <div class="row">
                <div class="col-sm-2">
                    <h1 class="tipoFuente">ShopPrime</h1>
                </div>

                <div id="frmBuscar" class="col-sm-6">
                    <form action="">
                        <div class="input-group mb-3">
                            <button type="button" class="btn btn-warning dropdown-toggle" data-bs-toggle="dropdown">
                                Categorias
                              </button>
                              <ol  class="dropdown-menu ">
                                <li><a class="dropdown-item" href="#">Alimentos y Bebidas</a></li>
                                <li><a class="dropdown-item" href="#">Electrónicos</a></li>
                                <li><a class="dropdown-item" href="#">Ropa y Calzado</a></li>
                              </ol>
                            <input class="form-control border " type="text" name="txtBuscar" id="txtBuscar"
                                placeholder="Buscar ShopPrime">

                            <button class="btn btn-warning" type="button" name="btnBuscar">
                                <i class="fa-solid fa-magnifying-glass"></i>
                            </button>

                        </div>
                    </form>
                </div>

                <div class="col-sm-2">
                    
                    <button type="button" class="btn btn-warning dropdown-toggle" data-bs-toggle="dropdown">
                    <?php
                    echo  'Hola '. $_SESSION['usuarioValido'];
                    ?>    
                    Cuenta
                      </button>
                      <ol  class="dropdown-menu ">
                        <li><a class="dropdown-item" href="editarCuanta.php" target="_blank">Editar Cuenta</a></li>
                        <li><a class="dropdown-item" href="../../../controlador/cerrarSesion.php" target="_blank">Salir</a></li>
                        
                      </ol>

                </div>
                <div class="col-sm-2">
                    <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor"
                        class="bi bi-cart4" viewBox="0 0 16 16">
                        <path
                            d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z" />
                    </svg>
                    <a class="text-white text-center" href=""> Carrito</a>
                </div>

            </div>

        </header>
        <!-- Fin Encabezado -->

        <!--Menu -->
        <nav>
            <ul>

                <li>
                    <div class="offcanvas offcanvas-start text-bg-dark" id="demo">
                        <div class="offcanvas-header">
                            <h1 class="offcanvas-title">Heading</h1>
                            <button type="button" class="btn-close btn-close-white"
                                data-bs-dismiss="offcanvas"></button>
                        </div>
                        <div class="offcanvas-body">
                            <p>Some text lorem ipsum.</p>
                            <p>Some text lorem ipsum.</p>
                            <p>Some text lorem ipsum.</p>
                            <button class="btn btn-secondary" type="button">A Button</button>
                        </div>
                    </div>

                    
                    <a id="todo" data-bs-toggle="offcanvas" data-bs-target="#demo"> <i class="fas fa-list" style="color: #ffffff;"></i> Todo</a>
                </li>

                <li class="active">
                    <a href="../../../vista/paginas/inicio.html" target="iframeContenedor">
                        <i class="fa-solid fa-house" style="color: #ffffff;">

                        </i>
                        inicio
                    </a>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Promociones</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Computadora</a></li>
                        <li><a class="dropdown-item" href="#">Celulares</a></li>
                        <li><a class="dropdown-item" href="#">Ropa</a></li>
                    </ul>
                </li>
                <li> <a href="../../../vista/paginas/" target="iframeContenedor">Ofertas</a></li>
                <li> <a href="../../../vista/paginas/" target="iframeContenedor">Servicio al Cliente</a></li>

                <li id="perfil"> <a href="">perfil</a></li>
            </ul>
        </nav>
        <!--Fin Menu -->

        <!-- Contenido pagina -->
        <section>
            <iframe src="../../../vista/paginas/inicio.html" frameborder="0" name="iframeContenedor" width="100%" height="600px">

            </iframe>
        </section>
        <!-- Fin Contenido pagina -->

        <!-- Pie pagina -->
        <footer class="py-3 my-4">
            <ul class="nav justify-content-center border-bottom pb-3 mb-3">
              <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Home</a></li>
              <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Features</a></li>
              <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Pricing</a></li>
              <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">FAQs</a></li>
              <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">About</a></li>
            </ul>
            <p class="text-center text-muted">&copy; 2022 Company, Inc</p>
          </footer>
        <!-- Pie pagina -->



    </div>

</body>

<script>
    var popoverTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="popover"]'))
    var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
      return new bootstrap.Popover(popoverTriggerEl)
    })
    </script>
</html>
<?php
}else{
    echo 'Debes iniciar Sesion...';
    echo '
    <a href="../iniciarsesion.html">
     Iniciar Sesion
    </a>
    ';
}
?>