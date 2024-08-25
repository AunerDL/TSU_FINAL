create database Zapateria;

use Zapateria;

drop table vendedor;
drop table Almacen;

create table Vendedor(
id_vendedor int identity (1,1)  not null ,
nombre_vendedor varchar(50) null ,
sueldo decimal null,
Cantidad_ventas int null,
Telefono int null,
Email varchar(50) null
);

create table cliente(
id_cliente  int identity (1,1) not null,
id_vendedor int not null,
nombre_Cli varchar(50) null,
telefono_Cli bigint null,
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
telefono_Proveedor bigint
);

create table comprasCalzado(
idCompra int identity(1,1) not null, 
idProv int,
canidadCompra int,
TotalCompra decimal(10,2)
);

select*from vendedor;

insert into vendedor values('Isrrael',1450, 150, 1526489562, '22300048@uttt.edu.mx');
insert into vendedor values('Laura',1400, 15, 1548562315, '20300048@uttt.edu.mx');
insert into vendedor values('Javier',1300, 152, 1548561232, '12300048@uttt.edu.mx');
insert into vendedor values('Rosa',1150, 152,1548654859, '22100048@uttt.edu.mx');
insert into vendedor values('Victor',1650, 515, 1548652684, '22307048@uttt.edu.mx');


select * from Descripcion;

insert into Descripcion values('Tenis Marca PUMA', 26.5, 'Tela');
insert into Descripcion values('Zapatos Flexi', 25,'Plastico');
insert into Descripcion values('Botas Flexi', 27,'Plastico');
insert into Descripcion values('Zapatillas Nine West', 24.5,'Cintetico');
insert into Descripcion values('Sandalias Birkenstock', 29.5,'Piel');


select * from Categoria;

insert into Categoria values (1, 'PUMA');
insert into Categoria values (2, 'Flexi');
insert into Categoria values (3, 'Flexi');
insert into Categoria values (4, 'Nine West');
insert into Categoria values (5, 'Birkenstock');

select * from Productos;

insert into Productos values(1,'Tenis', 150, 1250);
insert into Productos values(2,'Zapatos',120,875);
insert into Productos values(3,'Botas',125,1050);
insert into Productos values(4,'Zapatillas',350,955);
insert into Productos values(5,'Sandalias',12,339);

select * from comprasCalzado;

insert into comprasCalzado values(1,2,2500);
insert into comprasCalzado values(2,2,1750);
insert into comprasCalzado values(3,4,4200);
insert into comprasCalzado values(4,6,6730);
insert into comprasCalzado values(5,2,678);

select * from cliente;

insert into cliente values(3,'Saul',7731594562,'Emiliano Zapata','Tenis');
insert into cliente values(2,'Brayan',7295468631,'Benito juarez','Botas');
insert into cliente values(5,'Brian',5510458530,'Miguel Hidalgo','Zapatos');
insert into cliente values(4,'Nestor',8543212003,'La Lomita','Sandalias');
insert into cliente values(1,'Alejandra',7789181025,'Reforma','Zapatillas');

select *from Almacen;

insert into Almacen values(1,50,300,150);
insert into Almacen values(2,40,200,120);
insert into Almacen values(3,40,200,125);
insert into Almacen values(4,100,600,350);
insert into Almacen values(5,10,50,12);


select *from Proveedor;

insert into Proveedor values('PUMA',7731956810);
insert into Proveedor values('Flexi',5151896515);
insert into Proveedor values('Flexi',4842562626);
insert into Proveedor values('Mr shoes',8782992625);
insert into Proveedor values('Lilipu shoes',7761221216);

select *from venta;

insert into venta values(1,2,getdate(),2,875,1750);
insert into venta values(2,2,getdate(),4,1050,4200);
insert into venta values(3,3,getdate(),6,955,6730);
insert into venta values(4,4,getdate(),2,1250,2500);
insert into venta values(5,5,getdate(),2,339,678);
