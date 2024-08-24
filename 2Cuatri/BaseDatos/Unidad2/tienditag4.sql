# SQL - LDD (Create, alter, drop)
# Crear base de  datos
create database tienditag4;
# Usar la base de datos tienditag4
use tienditag4;

# Crear tabla cliente
create table cliente(
idcliente int not null auto_increment,
nombre varchar(30) not null,
rfc varchar(13) not null,
limite_credito decimal(10,2) not null,
direccion varchar(50) not null,
email varchar(30),
tel varchar(20),
sitioweb char(30),
constraint pk_cliente primary key(idcliente),
constraint unico_nombre_cliente unique(nombre),
constraint unico_rfc_cliente unique(rfc),
constraint chk_limitecredito_cliente check(limite_credito>=0.0 and limite_credito<=100000)
)engine innodb;

# Eliminar tabla cliente
drop table ciente;

# Eliminar  constrain primary key
alter table cliente modify column idcliente int not null; 

ALTER TABLE cliente DROP primary key;

# Eliminar el unique de nombre
alter table cliente drop constraint unico_nombre_cliente;

# Eliminar el unique de rfc
alter table cliente drop constraint unico_rfc_cliente;

# agregar constraint de primary key
alter table cliente add constraint pk_cliente primary key(idcliente);

# agregar columna activo int
alter table cliente add column activo int not null;