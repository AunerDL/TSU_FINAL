Create database Zapateria1;

use Zapateria1;

create table Vendedor
(
id_vendedor int identity (1,1)  not null ,
nombre_vendedor varchar(50) null ,
sueldo decimal null,
Cantidad_ventas int null,
Telefono int null,
Email varchar(50) null,
);

create table cliente
(
id_cliente  int identity (1,1) not null,
id_vendedor int not null,
nombre_Cli varchar(50) null,
telefono_Cli int null,
Direccion varchar(50) null,
Compra_Client varchar(100) null
);


create table Venta(
NumFactura int identity(1,1)not null,
idVendedor int,
idProd int,
FechaVenta date,
Cantidad int,
PrecioProducto decimal(10,2),
Total int
);

create table Descripcion(
Id_Descripcion int identity (1,1) not null,
Mod_Vendido varchar (100),
Talla decimal (10,2),
Tipo varchar (100),
);

create table Categoria (
Id_Categoria int identity (1,1) not null,
Id_Descripcion int,
MarcaProducto varchar (100)
);

create table Productos (
id_producto int identity (1,1) not null,
id_categoria  int,
nombre_Productos varchar (50),
stock_productos int,
precio_Productos decimal(10,2)
);

create table Almacen (
id_Modelo int identity (1,1) not null,
id_Producto int,
stock_Maximo int,
stock_Minimo int,
stock_Productos int,
);

create table Proveedor (
id_Proveedor int identity (1,1) not null,
nombre_Empresa varchar (50),
telefono_Proveedor int);

create table comprasCalzado(
idCompra int identity(1,1) not null, 
idProv int,
canidadCompra int,
TotalCompra decimal(10,2),
);



use Zapateria;

select * from Vendedor;

insert into vendedor values('Isrrael',1450, 150, 1526489562, '22300048@uttt.edu.mx');
insert into vendedor values('Laura',1400, 15, 1548562315, '20300048@uttt.edu.mx');
insert into vendedor values('Javier',1300, 152, 1548561232, '12300048@uttt.edu.mx');
insert into vendedor values('Rosa',1150, 152,1548654859, '22100048@uttt.edu.mx');
insert into vendedor values('Victor',1650, 515, 1548652684, '22307048@uttt.edu.mx');


select * from Descripcion;

insert into Descripcion values('Tenis Marca PUMA', 26.5, 'Tela');
insert into Descripcion values('Tenis Marca NIKE', 26.5, 'Tela');
insert into Descripcion values('Tenis Marca ', 26.5, 'Tela');
insert into Descripcion values('Tenis Marca ', 26.5, 'Tela');
insert into Descripcion values('Tenis Marca ', 26.5, 'Tela');

select * from Categoria;

insert into Categoria values ('Tenis Marca PUMA', 'PUMA');

select * from Productos;

insert into Productos values('Isrrael',1450, 150, 1526489562, '22300048@uttt.edu.mx')

select * from cliente;

insert into cliente values(1, 1,'Saul', 7731594562, 'Emiliano Zapata','')