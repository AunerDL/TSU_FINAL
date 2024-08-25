create database bancos
go

use bancos;
create table banco
(
idcliente int primary key,
nombre varchar(50),
saldo int)



insert into banco values(1,'Jose',500)
insert into banco values(2,'Laura',400)
insert into banco values(3,'Javier',300)
insert into banco values(4,'Rosa',150)
insert into banco values(5,'Victor',650)
insert into banco values(6,'Isrrael',450)

use banco
go

----------------------------------------------------
select * from banco;

--Transaccion de actualizacion

begin tran

update banco set saldo = 700 where idcliente = 2;

-- Cancelar
rollback

--Confirmar
commit

-----------------------------------------------------
--Transaccion de delete
begin tran
delete banco where idcliente = 6;

commit

-----------------------------------------------------
--Transaccion de actualizar con rollback, commit y rollback (se termina en el commit)
select * from banco;

begin tran

update banco set saldo = 900 where idcliente = 2;

rollback --commit

----------------------------------------------------
--Transaccion con if
begin tran

update banco set saldo = 900 where idcliente = 2;

insert into banco values(5, 'Sandy', 400)
insert into banco values(7, 'Sandy', 400)

--Declarar variable
declare @error int

--Se le asigna un valor a la variable (entre 1 a 99)
set @error = @@Error

--If para crear mensaje de error
if(@error <> 0)
begin
rollback tran
print 'ERROR EN LA TRANSACCION'
end

else
commit

-------------------------------------------------------
--Transaccion con condicion

--Crear procedimiento
create procedure InsertarNuevoCliente

--Definir parametros
@idcliente int,
@nombre varchar(50),
@saldo int
as
begin 
  begin try
    begin transaction
      if (@saldo >= 500)
	    begin
	       insert into banco(idcliente, nombre saldo)
		          values(@idcliente, @nombre, @saldo);

	    end
	 else
	 begin 
	    print 'El saldo debe ser mayor o igual a 500, para realizar la transaccion'

	--Confirmar la transaccion
	commit transaction
  end try
  begin catch
    if @@TRACOUNT > 0
	rollback transaction
	throw;
  end catch
end

--Consulta
execute InsertarNuevoCliente 
@idcliente = 10, @nombre = 'Tmamo', @saldo = 200;

execute InsertarNuevoCliente 
@idcliente = 11, @nombre = 'Tmamo', @saldo = 700;

select * from banco;
  
begin tran
	update banco
	set banco.saldo-=100
	where idcliente=1
	
	update banco
	set banco.saldo+=100
	where idcliente=2
	
	if(@@ERROR=0)
		begin
			commit
		end
	else
		begin
			rollback
		end

--Si el saldo del cliente 1 y es mayor--
--al saldo del cliente 2, confirmar  la--
--Transaccion

begin tran
--obtener los datos 
declare @saldoCliente1 int;
declare @saldoCliente2 int;

select @saldoCliente1 = saldo from banco where idcliente =1;
select @saldoCliente2 = saldo from banco where idcliente =2;

--verifica si el saldo del cliente 1 es mayor del cliente 2
if(@saldoCliente1 > @saldoCliente2)
	begin
		update banco set saldo=saldo -100 where idcliente=1;
		update banco set saldo=saldo +100 where idcliente=2;
		commit;
		print 'La transaccion se completado correctamente.';
	end
else
	begin
		rollback;
		print 'La transaccion a sido canselada debido al saldo del cliente 1.';
	end
go

update banco set saldo=200 where idcliente=1;
update banco set saldo=300 where idcliente=2;

begin tran
declare @saldoCliente1 int;
declare @saldoCliente2 int;

select @saldoCliente1 = saldo from banco where idcliente=1;
select @saldoCliente2 = saldo from banco where idcliente =2;

if(@saldoCliente1=300)
	begin
		update banco set saldo=saldo-300 where idcliente=1;
		update banco set saldo=saldo+300 where idcliente=2
		commit;
		print 'La transaccion fue completada con exito';
	end
else
	begin
	rollback;
	print 'La transaccions no fue completada por que el saldo es menos a 300';
	end
go

select*from banco;

update banco set saldo=300 where idcliente=1;
update banco set saldo=300 where idcliente=2;

begin tran
declare @saldoCliente1 int;
declare @saldoCliente2 int;
declare @transaccion int = 300;

select @saldoCliente1 = saldo from banco where idcliente=1;
select @saldoCliente2 = saldo from banco where idcliente =2;

if(@saldoCliente1 = @transaccion)
	begin
		update banco set saldo=saldo- @transaccion where idcliente=1;
		update banco set saldo=saldo+ @transaccion where idcliente=2
		commit;
		print 'La transaccion fue completada con exito';
	end
else
	begin
	rollback;
	print 'La transaccions no fue completada por que el saldo es menos a 300';
	end
go

select*from banco;
