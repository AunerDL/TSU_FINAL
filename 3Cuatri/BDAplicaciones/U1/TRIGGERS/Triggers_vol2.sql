use utstore;

--crear y nombre
--tipo de tabla
--para lo que va a servir
--as indicar la programacion de trigger
--insertar  

create trigger TR_InsertarClientes
on clientes 
for insert 
as set nocount on 
insert into bitacora 
values (1, null, null, getdate(), null, null, user);

--alterar el trigger
alter trigger TR_InsertarClientes
on clientes for insert 
as set nocount on 
insert into bitacora values (2, null, null, getdate(), null, null, user);

select * from clientes

--Crear tabla bitacora
create table bitacora(
ID int not null,
datosAND varchar(100) null,
datosNuevo varchar(100) null,
tiempo datetime null,
tabla varchar(50) null,
operacion varchar(50) null,
constraint pk_ID primary key(ID)
);

truncate table bitacora;

alter table bitacora add usuario varchar(50) null;

select*from clientes;
insert into clientes values(14,'Jose Antonio','MEXICO','CDMX','Tepito',31,'1992-05-03');
insert into clientes values(15,'Wiliam Estrada','MEXICO','HIDALGO','Socalo',29,'1994-04-19');
select*from bitacora;
