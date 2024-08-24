create database Empresa1;

use empresa1;

create table cliente(
idCliente int not null auto_increment,
curp varchar(18) not null,
FechaNaci date not null,
nombre varchar(50) not null,
direccion varchar(50) not null,
constraint pk_idCliente primary key(idCliente)
)engine innodb;

create table producto(
codigoProducto int not null auto_increment,
precioUnitario double(10,2) not null,
nombre varchar(30) not null,
constraint pk_codigoProducto primary key(codigoProducto)
)engine innodb;

create table provedor(
Codigo int not null auto_increment,
rfc varchar(13) not null,
nombre varchar(20) not null,
direccion varchar(50) not null,
constraint pk_Codigo primary key(Codigo)
)engine innodb;

create table compra(
codigoProducto int not null,
idCliente int not null
)engine innodb;