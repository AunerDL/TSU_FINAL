use Northwind;
go

--permiso para seleccionar tablas
select*from Customers;

--intentamos de crear una tabla pero no deja por que no tenemos permiso de crear tablas
create table cliente1(
id int identity(1,1) primary key,
bduser varchar(100),
accion varchar(100),
fecha datetime
);
go


