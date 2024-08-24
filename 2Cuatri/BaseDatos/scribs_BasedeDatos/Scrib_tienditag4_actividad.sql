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
use tienditag4;

create table Categoria(
idCategoria int not null auto_increment,
codigo varchar(15) not null,
nombre varchar(50) not null,
constraint pk_categoria primary key(idCategoria),
constraint unique_codigo unique(codigo),
constraint unique_nombre_categoria unique(nombre)
)engine innodb;

create table Empleado(
idEmpleado int not null,
nombre varchar(50) not null,
apellido1 varchar(50) not null,
apellido2 varchar(50) not null,
direccion varchar(100) not null,
tel varchar(20),
edad int not null,
sexo char(1) not null,
salario decimal(10,2) not null,
constraint pk_empleado primary key(idEmpleado),
constraint chk_edad check(edad>=18 and edad<=70),
constraint chk_sexo check(sexo = 'H' and sexo = 'M'),
constraint chk_salario check(salario>=1000 and salario<=50000)
)engine innodb;

create table Producto(
idProducto int not null,
fabricanteid char(5) not null,
descripcion varchar(100) not null,
precio decimal(10,2) not null,
stockMaximo int not null,
stockMinimo int not null,
existencia int not null,
activo int not null,
categoria int not null,
constraint pk_producto primary key(idProducto),
constraint unique_descripcion_producto unique(descripcion),
constraint chk_precio_producto check(precio>0),
constraint chk_stockMaximo check(stockMaximo>=100 and stockMaximo<=100000),
constraint chk_stockMinimo check(stockMinimo>=5 and stockMinimo<=100000),
constraint chk_existencia check(existencia>0),
constraint chk_activo_producto check(activo=0 or activo=1),
constraint fk_producto_categoria foreign key(categoria) references Categoria(idCategoria)
)engine innodb;

create table detalleventa(
idVenta int not null,
idProducto int not null,
fabricante char(5) not null,
precio decimal(10.2) not null,
cantidad int not null,
constraint pk_detalleventa primary key(idVenta, idProducto, fabricante),
constraint fk_detalleventa_producto foreign key(idProducto, fabricante) references Producto(idProducto, fabricanteid)
)engine innodb;

create table venta(
idVenta int not null auto_increment,
fecha date not null,
cliente int not null,
empleado int not null,
clave varchar(10) not null,
constraint pk_venta primary key(idVenta),
constraint fk_venta_cliente foreign key(cliente) references cliente(idcliente),
constraint fk_venta_empleado foreign key(empleado) references Empleado(idEmpleado)
)engine innodb;

alter table detalleventa
add constraint fk_detalleventa_venta foreign key(idVenta) references venta(idVenta);

drop table Producto;
drop table detalleventa;