-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Ferreteria
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Ferreteria` ;

-- -----------------------------------------------------
-- Schema Ferreteria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Ferreteria` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
-- -----------------------------------------------------
-- Schema ventag4
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `ventag4` ;

-- -----------------------------------------------------
-- Schema ventag4
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ventag4` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
SHOW WARNINGS;
USE `Ferreteria` ;

-- -----------------------------------------------------
-- Table `CATEGORIA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `CATEGORIA` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `CATEGORIA` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(100) NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `PROVEDOR`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PROVEDOR` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `PROVEDOR` (
  `idProvedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(50) NOT NULL,
  `telefono` VARCHAR(20) NOT NULL,
  `paginaweb` VARCHAR(30) NULL,
  PRIMARY KEY (`idProvedor`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `PRODUCTO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `PRODUCTO` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `PRODUCTO` (
  `idProducto` INT NOT NULL,
  `fabricante` CHAR(5) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `precioActual` DECIMAL(10,2) NOT NULL,
  `stock` INT NOT NULL,
  `idCategoria` INT NOT NULL,
  `provedor` INT NOT NULL,
  PRIMARY KEY (`idProducto`, `fabricante`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `CLIENTE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `CLIENTE` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `CLIENTE` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `calle` VARCHAR(45) NOT NULL,
  `numero` INT NULL,
  `comunidad` VARCHAR(45) NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `TELEFONOCONTACTO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TELEFONOCONTACTO` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `TELEFONOCONTACTO` (
  `idTELEFONOCONTACTO` INT NOT NULL AUTO_INCREMENT,
  `telefono` VARCHAR(20) NOT NULL,
  `cliente` INT NULL,
  PRIMARY KEY (`idTELEFONOCONTACTO`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `VENTA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `VENTA` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `VENTA` (
  `idVenta` INT NOT NULL AUTO_INCREMENT,
  `fechaventa` DATE NOT NULL,
  `cliente` INT NOT NULL,
  PRIMARY KEY (`idVenta`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Detalle_VENTA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Detalle_VENTA` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `Detalle_VENTA` (
  `producto` INT NOT NULL,
  `fabricante` CHAR(5) NOT NULL,
  `idVenta` INT NOT NULL,
  `cantidad` INT NOT NULL,
  `precioventa` DECIMAL(10,2) NOT NULL,
  `descuento` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`producto`, `fabricante`, `idVenta`))
ENGINE = InnoDB;

SHOW WARNINGS;
USE `ventag4` ;

-- -----------------------------------------------------
-- Table `categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `categoria` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `categoria` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NOT NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;
CREATE UNIQUE INDEX `unique_nombre_categoria` ON `categoria` (`nombre` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `producto` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NOT NULL,
  `precio` DECIMAL(10,2) NOT NULL,
  `stock` INT NOT NULL,
  `idcategoria` INT NOT NULL,
  PRIMARY KEY (`idproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

SHOW WARNINGS;
CREATE UNIQUE INDEX `unique_nombre_producto` ON `producto` (`nombre` ASC) VISIBLE;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
