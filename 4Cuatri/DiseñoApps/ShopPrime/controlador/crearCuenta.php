<?php
include_once '../modelo/ConexionBDShopPrime.php';
$objConexionBD=new ConexionBDShopPrime("localhost:3306","root",
"121314","ShopPrimeBD");
//datos de formulario
$nombreUsuario=$_REQUEST['txtUsuario'];
$apPaternoUsuario=$_REQUEST['txtApPaterno'];
$apMaternoUsuario=$_REQUEST['txtApMaterno'];
$emailUsuario=$_REQUEST['txtEmail'];
$telefonoUsuario=$_REQUEST['txtTelefono'];
$fotoUsuario=addslashes(file_get_contents($_FILES['txtFoto']['tmp_name']));
$nombreFotoUsuario=$_FILES['txtFoto']['name'];
$nombreLogin=$_REQUEST['txtNombreLogin'];
$claveLogin=$_REQUEST['txtPassword'];
$idRolUsuario=$_REQUEST['txtTipoUsuario'];

//echo 'Foto' .$fotoUsuario;
//echo 'Nombre Foto' . $nombreFotoUsuario;

//Conectar a la base de datos
if($objConexionBD->getConexionBD()){
    echo 'Conexion exitosa....';
    try{
    $instrucionSQL=$objConexionBD->getConn()->prepare("
    call ShopPrimeBD.sp_crearCuenta(:nomU,:apPaternoU,:apMaternoU,:emailU,:telU,
    :fotoU,:nomFotoU,:nomL,:claveL,:idRolU);
    ");
    $instrucionSQL->bindParam(':nomU',$nombreUsuario);
    $instrucionSQL->bindParam(':apPaternoU',$apPaternoUsuario);
    $instrucionSQL->bindParam(':apMaternoU',$apMaternoUsuario);
    $instrucionSQL->bindParam(':emailU',$emailUsuario);
    $instrucionSQL->bindParam(':telU',$telefonoUsuario);
    $instrucionSQL->bindParam(':fotoU',$fotoUsuario);
    $instrucionSQL->bindParam(':nomFotoU',$nombreFotoUsuario);
    $instrucionSQL->bindParam(':nomL',$nombreLogin);
    $instrucionSQL->bindParam(':claveL',$claveLogin);
    $instrucionSQL->bindParam(':idRolU',$idRolUsuario);
    
    //Ejecutar Instruccion 
    $instrucionSQL->execute();
    echo 'Se guardo correctamente los datos de la cuenta';
    }catch(PDOException $e){
        echo 'Error de sintaxis de SQL' . $e->getMessage();
    }
    $objConexionBD->setConn(null);
}else{
    echo 'Fallo la conexion';
}




?>