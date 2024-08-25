use utstore2;

--triggers--

--1--

create table Acciones(
idAccion int identity(1,1) primary key,
Accion varchar(50),
Tabla varchar(45),
Fecha date,
usuario varchar(45)
);

--clientes
select*from clientes;
create trigger TR_insertarClientes
on clientes for insert
as set nocount on
insert into Acciones values('INCERTAR','Clientes',getdate(),user);

insert into clientes values(13,'Jose Roberto','MEXICO','EDOMEX','Tepito',24,getdate());


create trigger TR_actualizarClientes
on clientes for update
as set nocount on
insert into Acciones values('ACTUALIZAR','Clientes',getdate(),user);

update clientes set pais='EUA' where idcli=5;


create trigger TR_EliminarClientes
on clientes for delete
as set nocount on
insert into Acciones values('ELIMINAR','Clientes',getdate(),user);

delete clientes where idcli=13;



--productos

select*from productos;
create trigger TR_insertarProductos
on productos for insert
as set nocount on
insert into Acciones values('INCERTAR','Productos',getdate(),user);

insert into productos values(34,'CHETTOS',35.00,150,getdate(),null,null);


create trigger TR_actualizarProductos
on productos for update
as set nocount on
insert into Acciones values('ACTUALIZAR','Productos',getdate(),user);

update productos set nompro='LECHERA' where idpro=10;


create trigger TR_EliminarProductos
on productos for delete
as set nocount on
insert into Acciones values('ELIMINAR','Productos',getdate(),user);

delete Productos where idpro=34;



--Proveedores

select*from proveedores;

create trigger TR_insertarProveedores
on proveedores for insert
as set nocount on
insert into Acciones values('INCERTAR','Proveedores',getdate(),user);

insert into proveedores values(14,'ARIZONA','EDOMEX','VTAS@ARIZONA.MX',null);


create trigger TR_actualizarProveedores
on proveedores for update
as set nocount on
insert into Acciones values('ACTUALIZAR','Proveedores',getdate(),user);

update proveedores set direccion='UTTT' where idpv=7;


create trigger TR_EliminarProveedores
on proveedores for delete
as set nocount on
insert into Acciones values('ELIMINAR','Proveedores',getdate(),user);

delete proveedores where idpv=14;



--MOSTRAR
select*from Acciones;