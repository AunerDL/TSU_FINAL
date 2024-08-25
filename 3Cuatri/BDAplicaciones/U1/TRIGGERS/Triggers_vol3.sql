use utstore;
go

--crear trigger de detalle
create trigger TR_Detalle
on detalle 
for insert as set nocount on 
insert into bitacora values(3,null, null,getdate(),'detalle','insertar', user);
go 

select*from bitacora;
go
select*from detalle;
go

insert into detalle values(5,5,4,null);
select*from ventas;
select*from detalle;
go

--crear trigger de empleados
create trigger TR_Empleados
on empleados for insert 
as set nocount on 
insert into bitacora values(4,null,null,getdate(),'empleado','insertar',user);

--insertar empleado
select*from empleados;
insert into empleados values(7,'JOSE ROBERTO','TEPEJI',20,6000.00,'M');
go

--crear trigger de productos
create trigger TR_Product
on productos for insert
as set nocount on
insert into bitacora values(5,null,null,getdate(),'producto','insertar',user);

--insertar producto
select*from productos;
insert into productos values(34,'ARIZONA',25.00,100,'2023-12-07',3,6);
insert into productos values(35,'RVA BIBLIA',30.00,100,null,4,5);

select*from  bitacora;
go

--eliminar rejistro 
create trigger TR_eliminaDetalle
on detalle for delete
as set nocount on
insert into bitacora values(6,null,null,getdate(),'detalle','eliminar',user);

	
--eliminar 
delete detalle where venta=29;
select*from  bitacora;
go

--eliminar empleados
create trigger TR_eliminaEmpleado
on empleados for delete
as set nocount on
insert into bitacora values(7,null,null,getdate(),'empleado','eliminar',user);
select*from empleados;

--elimina
delete empleados where idemp=7;
select*from bitacora;
go
--eliminar productos
create trigger TR_eliminarProductos
on productos for delete
as set nocount on
insert into bitacora values(8,null,null,getdate(),'productos','eliminar',user);
select*from productos;

--elimina
delete productos where idpro=35;
select*from bitacora;

--Actualizar detalle
create trigger TR_actualizaDetalle
on detalle for update
as set nocount on
insert into bitacora values(9,null,null,getdate(),'detalles','actualiza',user);

select*from detalle;
--actualiza
update detalle set cantidad=3 where venta=5 and producto=30;

--Actualiza empleados
create trigger TR_actualizaEmpleado
on empleados for update
as set nocount on
insert into bitacora values(10,null,null,getdate(),'empleado','actualiza',user);

select*from empleados;
--actualiza
update empleados set sueldo=6500.00 where idemp=6;

--Actualiza productos
create trigger TR_actualizaProducto
on productos for update
as set nocount on
insert into bitacora values(11,null,null,getdate(),'producto','actualiza',user);

alter trigger TR_actualizaProducto
on productos for update
as set nocount on
insert into bitacora values(11,null,null,getdate(),'producto','actualiza',user);

select*from productos;
--Actualiza
update productos set precio=14.00 where idpro=6;

select*from bitacora;