<?php
include_once '../modelo/ConexionBDShopPrime.php';
$objConexionBD=new ConexionBDShopPrime("localhost:3306","root",
"121314","ShopPrimeBD");
//Variables de formulario
$usuarioU=$_REQUEST['txtUsuario'];
$contraseniaU=$_REQUEST['txtContrasenia'];

if($objConexionBD->getConexionBD()){
echo 'Conexion exitosa....';
$instrucionSQL=$objConexionBD->getConn()->prepare("
call ShopPrimeBD.sp_validarLogin(:usuario,:clave);
");
$instrucionSQL->bindParam(':usuario',$usuarioU);
$instrucionSQL->bindParam(':clave',$contraseniaU);

//Ejecutar Instruccion 
$instrucionSQL->execute();


$datosConsulta=$instrucionSQL->fetchAll();

echo json_encode($datosConsulta);
/*
$usuario= $datosConsulta[0]['nombreUsuario'];
$nombreLogin= $datosConsulta[0]['nombreLogin'];
$emailUsuario= $datosConsulta[0]['emailUsuario'];

$contrasenia=$datosConsulta[0]['claveLogin'];
$rolUsuario=$datosConsulta[0]['nombreRolUsuario']; 
echo 'nombre : '.$usuario;
echo 'clave : '.$contrasenia;
echo 'Rol : '.$rolUsuario;

if (
    ($usuario==$usuarioU ||$nombreLogin==$usuarioU || $emailUsuario==$usuarioU)
    && $contrasenia==$contraseniaU 
    && $rolUsuario=="administrador"
    ) {
    echo 'Usuario y/o Contresaña Validos';
    session_start();
    $_SESSION['usuarioValido']=$usuario;
    echo '
    <script>
    window.location.href="../vista/paginas/administrador/indexAdmin.php";
    </script>
    ';
}elseif (
    ($usuario==$usuarioU ||$nombreLogin==$usuarioU || $emailUsuario==$usuarioU)
    && $contrasenia==$contraseniaU 
    && $rolUsuario=="cliente"
    ) {
    echo 'Usuario y/o Contresaña Validos';
    session_start();
    $_SESSION['usuarioValido']=$usuario;
    echo '
    <script>
    window.location.href="../vista/paginas/cliente/indexCliente.php";
    </script>
    ';
} else {
    echo 'Usuario y/o Contresaña No Validos';
}

*/

}else{
    echo 'Fallo la conexion';
}

?>