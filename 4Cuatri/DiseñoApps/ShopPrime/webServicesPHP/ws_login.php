<?php
include_once '../modelo/ConexionBDShopPrime.php';
$objConexionBD=new ConexionBDShopPrime("localhost:3306","root",
"121314","ShopPrimeBD");
//Variables de formulario
$usuarioU=$_REQUEST['usuario'];
$contraseniaU=$_REQUEST['contrasenia'];

if($objConexionBD->getConexionBD()){

$instrucionSQL=$objConexionBD->getConn()->prepare("
call ShopPrimeBD.sp_validarLogin(:usuario,:clave);
");
$instrucionSQL->bindParam(':usuario',$usuarioU);
$instrucionSQL->bindParam(':clave',$contraseniaU);

//Ejecutar Instruccion 
$instrucionSQL->execute();


$datosConsulta=$instrucionSQL->fetchAll();

echo json_encode($datosConsulta);

}else{
    echo 'Fallo la conexion';
}


?>