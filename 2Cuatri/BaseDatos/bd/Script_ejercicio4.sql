create database Tienda;

use Tienda;
create table DimEmployees(
CodigoEmployee int not null auto_increment,
Employeeid int not null,
FirstName varchar(10)not null,
LastName varchar(20)not null,
hireDate date not null,
constraint pk_DimEmployee primary key (CodigoEmployee)
)Engine InnoDB;

create table DimCustomers(
CodigoCustomer int not null auto_increment,
Customerid char(5) not null,
CompanyName varchar(15)not null,
City varchar(15)not null,
Coutry varchar(15)not null,
constraint pk_DimCustomers primary key(CodigoCustomer)
)Engine InnoDB;

create table DimProducto(
CodigoProducto int not null auto_increment,
Productoid int not null,
ProductName varchar(40)not null,
CategoryName varchar(15),
constraint pk_DimProducto primary key(CodigoProducto)
)Engine InnoDB;

create table DimShipper(
CodigoShipper int not null auto_increment,
Shipperid int not null,
CompanyName varchar(40)not null,
constraint pk_DimShipper primary key(CodigoShipper)
)Engine InnoDB;

create table DimTiempo(
CodigoTiempo int not null,
Fecha date not null,
Anio int not null,
Trimestre int not null,
Mes int not null,
Dia int not null,
constraint pk_DimTiempo primary key(CodigoTiempo)
)Engine InnoDB;

create table FactVentas(
CodigoFact int not null auto_increment,
CodigoCustomerFk int not null,
CodigoEmployeeFK int not null,
CodigoProductoFK int not null,
CodigoShipperFK int not null,
CodigoTiempoFK int not null,
Cantidad int,
Total decimal(10,2),
constraint pk_FactVentas primary key (CodigoFact),
constraint fk_factVentas_Customers foreign key(CodigoCustomerFk) references DimCustomers(CodigoCustomer),
constraint fk_factventas_Employees foreign key(CodigoEmployeeFK) references DimEmployees(CodigoEmployee),
constraint fk_factVentas_Productos foreign key(CodigoProductoFK) references DimProducto(CodigoProducto),
constraint fk_factVentas_Shippers foreign key(CodigoShipperFK) references DimShipper(CodigoShipper),
constraint fk_factVentas_Tiempo foreign key(CodigoTiempoFK) references DimTiempo(CodigoTiempo)
)Engine InnoDB;
drop table FactVentas;