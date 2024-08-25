USE utstore;
select*from sucursales;

create trigger TR_sucursalesInsertar
on sucursales for insert
as set nocount on
insert into bitacora values(11,null,null,getdate(),'Sucursal','Insertar',user);
insert into sucursales values(8,'RUSIA','RUSIASTORE');
GO

create trigger TR_sucursalesActualizar
on sucursales for update
as set nocount on
insert into bitacora values(12,null,null,getdate(),'Sucursal','Actualizar',user);
update sucursales set lugar='CHINA' where idsuc=7;
go

create trigger TR_productsEliminar
on sucursales for delete
as set nocount on
insert into bitacora values(13,null,null,getdate(),'Sucursal','Eliminar',user);
delete sucursales where idsuc=8;
go

sp_helptrigger sucursales;
select*from bitacora;
go

--Proveedores--
select*from proveedores;
go

create trigger TR_proveedoresInsertar
on proveedores for insert
as set nocount on
insert into bitacora values(14,null,null,getdate(),'Proveedores','Eliminar',user);

insert into proveedores values(14,'JOSE','TULA','VTAS@CHETOS.MX',null);
go

create trigger TR_proveedoresActualizar
on proveedores for update
as set nocount on
insert into bitacora values(15,null,null,getdate(),'Proveedores','Eliminar',user);

update proveedores set nompv='CHETOS' where idpv=14;
go

create trigger TR_proveedoresBorrar
on proveedores for delete
as set nocount on
insert into bitacora values(16,null,null,getdate(),'Proveedores','Eliminar',user);

delete proveedores where idpv=14;
go

sp_helptrigger proveedores;

