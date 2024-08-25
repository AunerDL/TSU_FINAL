use bancos;

--configurar el panel de aislamiento
set transaction isolation level read uncommitted
--iniciar la transaccion
begin transaction
--realizar una lectura de los datos sin confirmar cambios
select*from banco;
--simular la transaccion
update banco set saldo = saldo - 100 where idcliente = 1;
--Realizar otra lectura despues d lo cambios no confirmados
select*from banco;
--confirmar la transaccion
commit;

--configurar el panel de aislamiento
set transaction isolation level read committed
--iniciar la transaccion
begin transaction
--realizar una lectura de los datos sin confirmar cambios
select*from banco;
--simular la transaccion
update banco set saldo = saldo - 100 where idcliente = 1;
--Realizar otra lectura despues d lo cambios no confirmados
select*from banco;
--confirmar la transaccion
commit;

--configurar el panel de aislamiento
set transaction isolation level serializable
--iniciar la transaccion
begin transaction
--realizar una lectura de los datos sin confirmar cambios
select*from banco;
--simular la transaccion
update banco set saldo = saldo - 100 where idcliente = 1;
--Realizar otra lectura despues d lo cambios no confirmados
select*from banco;
--confirmar la transaccion
commit