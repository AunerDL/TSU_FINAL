		
		--Explicacion de transacciones

-- en la bariable error se guarda el error que puede mandar una transaccion
-- pero tambien se debe declarar en una variable para guardarla
declare @error int
set @error = @@error
--solo si queremos que el sistema arroje el error
--#nota debes de declarar antes de usar la variable

--dentro de un iff puede ir lo siguiente
if(@error <> 0)
--el begin o end son como corchetes
	begin
	rollback tran
	--imprime mensaje
	print 'error  en la transaccion'
	end
else
commit

--en una transaccion puedes insertar o actualizar
update banco set banco.saldo = 900
where id cliente