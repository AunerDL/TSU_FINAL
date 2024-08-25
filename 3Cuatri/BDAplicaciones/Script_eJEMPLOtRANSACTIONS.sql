use utstore;

select*from productos;
go

--primer transaccion
begin tran
insert into productos values(36,'MANGO',25.00,100,getdate(),3,6);
--si se cumple es rollback
ROLLBACK
--si no se cumple es commit
commit
go

--hacer una actualizacion e insercion con error
begin tran
declare @error int
update productos set precio=12.00 where idpro=34
insert into productos values(36,'SALCHICHON',25.00,100,getdate(),3,6)
set @error =  @@error
if(@error <> 0)
	begin
	rollback
	print 'ERROR EN LA TRANSACCION'
	end
else
commit