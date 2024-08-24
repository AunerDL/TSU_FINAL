#SQL-LDD(create,alter,drop)
#crear base de de datos 

create database tiendag4;
#usar baase de datos 
use tiendag4;
#crear tabla cliente
create table cliente (
idcliente int not null auto_increment,
nombre varchar(30) not null,
rfc varchar(13) not null,
limite_credito decimal(10,2) not null,
direcccion varchar(50) not null,
email varchar(30),
telefono varchar(20),
sitio_web char(30),
constraint pk_cliente
primary key(idcliente),
constraint unico_nombre_cliente
unique(nombre),
constraint unico_rfc_cliente
unique(rfc),
constraint chk_limitecredito_cliente
check(limite_credito>=0.0 and limite_credito<=100000)

)engine innodb;
#Eliminar un tabla cliente 
drop table cliente;
#eliminar constraint primary key
alter table cliente
modify column idcliente int not null;

ALTER TABLE cliente 
DROP primary key;

#eliminar el uniqui de nombre 
alter table cliente
drop constraint unico_nombre_cliente;

#eliminar el uniqui de rfc 
alter table cliente
drop constraint unico_rfc_cliente;

#agregar constrain de primary key
alter table cliente 
add constraint pk_cliente 
primary key (idcliente);

#agragar column activo int 
alter table cliente 
add column activo int not null;

create table categoria(
categoriaid int not null auto_increment,
codigo varchar(15) not null,
nombre varchar(50) not null,
constraint pk_categoria 
primary key(categoriaid),
constraint unique_codigo
unique(codigo),
constraint unique_nombre_categoria
unique (nombre)
);

create table Empleado(
empleadoid int not null,
nombre varchar(50) not null,
apellido1 varchar(50) not null,
apellido2 varchar(50) not null,
direccion varchar(100) not null,
tel varchar(20),
edad int  not null,
sexo char(1) not null,
salario decimal(10,2)not null,
constraint pk_empleado
primary key(empleadoid),
constraint chk_edad
check(edad>=18 AND edad<=70),
constraint chk_sexo
check (sexo='H' AND sexo='M'),
constraint chk_salario 
check (salario>=1000 AND salario <=50000)
);

create table producto(
productoid int not null,
fabricanteid char(5) not null,
descripcion varchar(100) not null,
precio decimal (10,2) not null,
stockMax int not null,
stockMin int not null,
existencia int not null,
activo int not null,
categoria int not null,
constraint pk_producto primary key(productoid,fabricanteid),
constraint unique_des_producto unique (descripcion),
constraint chk_precio_producto check(precio>0),
constraint chk_stockMax check(stockMax>=100 AND stockMax<=100000),
constraint chk_stockMin check(stockMin=5 AND stockMin<=100000),
constraint chk_existencia check(existencia>0),
constraint chk_activo_producto check(activo=0 OR activo=1),
constraint fk_producto_categoria foreign key(categoria) references categoria(categoriaid)
);

create table DetalleVenta(
ventaid int not null,
productoid int not null,
fabricante char(5)not null,
precio decimal(10,2) not null,
cantidad int not null,
constraint pk_detalleVenta primary key(ventaid,productoid,fabricante),
constraint fk_detalleVenta_producto foreign key(productoid,fabricante) references producto(productoid,fabricante)
);
create table venta(
ventaid int not null auto_increment,
fecha date not null,
cliente date not null,
empleado date not null,
clave varchar(10) not null,
constraint pk_venta primary key(ventaid)
)engine innodb;

create table contacto(
contactoid int not null auto_increment,
nombre varchar(45) not null,
apellido1 varchar(45) not null,
apellido2 varchar(45) not null,
direccion varchar(100),
telefono varchar(20),
cliente int,
constraint pk_contacto primary key(contactoid),
constraint fk_contacto_cliente foreign key(cliente) references cliente(idcliente)    
)engine innodb;