create database EntregasPaquetes;

use EntregasPaquetes;

create table Camion(
Matriculaid int not null,
modelo varchar(20) not null,
tipoTransporte varchar(20),
referencia varchar(30) not null,
fecha date not null,
constraint pk_Matriculaid primary key(Matriculaid)
)engine innodb;

create table Camionero(
NumCamionero int not null auto_increment,
nombre varchar(50) not null,
direccion varchar(50) not null,
curp varchar(18) not null,
salario double(10,2) not null,
telefono int not null,
comunidad varchar(30),
constraint pk_NumCamionero primary key(NumCamionero)
)engine innodb;

create table Paquete(
CodigoPaquete int not null,
descripcion varchar(20) not null,
NomDestinatario varchar(50) not null,
DreccioDestinatario varchar(50) not null,
constraint pk_CodigoPaquete primary key(CodigoPaquete)
)engine innodb;

create table Estado(
idEstado int not null,
nombre varchar(20) not null,
constraint pk_idEstado primary key(idEstado)
)engine innodb;

create table Conduce(
Matriculaid int not null,
NumCamionero int not null,
FechaConduccion date not null
)engine innodb;
