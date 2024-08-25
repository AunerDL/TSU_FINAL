<?php
class ConexionBDShopPrime{
    //Atributos
    private $nombreServidor;
    private $nombreUsuarioServidor;
    private $claveUsuarioServidor;
    private $nombreBaseDatos;
    private $conn;

    //constructor
    public function __construct(
    $nombreServidor,
    $nombreUsuarioServidor,
    $claveUsuarioServidor,
    $nombreBaseDatos
    ){
        $this->nombreServidor=$nombreServidor;
        $this->nombreUsuarioServidor=$nombreUsuarioServidor;
        $this->claveUsuarioServidor=$claveUsuarioServidor;
        $this->nombreBaseDatos=$nombreBaseDatos;

    }

    //Metodos set y get
    

    

    /**
     * Get the value of nombreServidor
     */
    public function getNombreServidor()
    {
        return $this->nombreServidor;
    }

    /**
     * Set the value of nombreServidor
     */
    public function setNombreServidor($nombreServidor): self
    {
        $this->nombreServidor = $nombreServidor;

        return $this;
    }

    /**
     * Get the value of nombreUsuarioServidor
     */
    public function getNombreUsuarioServidor()
    {
        return $this->nombreUsuarioServidor;
    }

    /**
     * Set the value of nombreUsuarioServidor
     */
    public function setNombreUsuarioServidor($nombreUsuarioServidor): self
    {
        $this->nombreUsuarioServidor = $nombreUsuarioServidor;

        return $this;
    }

    /**
     * Get the value of claveUsuarioServidor
     */
    public function getClaveUsuarioServidor()
    {
        return $this->claveUsuarioServidor;
    }

    /**
     * Set the value of claveUsuarioServidor
     */
    public function setClaveUsuarioServidor($claveUsuarioServidor): self
    {
        $this->claveUsuarioServidor = $claveUsuarioServidor;

        return $this;
    }

    /**
     * Get the value of nombreBaseDatos
     */
    public function getNombreBaseDatos()
    {
        return $this->nombreBaseDatos;
    }

    /**
     * Set the value of nombreBaseDatos
     */
    public function setNombreBaseDatos($nombreBaseDatos): self
    {
        $this->nombreBaseDatos = $nombreBaseDatos;

        return $this;
    }

    /**
     * Get the value of conn
     */
    public function getConn()
    {
        return $this->conn;
    }

    /**
     * Set the value of conn
     */
    public function setConn($conn): self
    {
        $this->conn = $conn;

        return $this;
    }


    //Metodos 
    public function getConexionBD(){

       try {
        $this->conn=new PDO("mysql:host=".$this->getNombreServidor().";dbname=".$this->getNombreBaseDatos(),$this->getNombreUsuarioServidor(),$this->getClaveUsuarioServidor());
        $this->conn->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);  
        return true; 
    } catch (PDOException $e) {
       echo 'Error de conexion a la base de datos'. $e->getMessage();
       }
      

        return false;
    }
}
?>