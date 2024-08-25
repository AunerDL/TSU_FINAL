use utstore
go

create table usuarios(
usuario varchar(max),
clave varchar(max))
--llave varchar(max))

drop table usuarios

---crear un procedimiento basico
create proc sp_insert_usuarios
@users varchar(max),
@pss varchar(max)
as
begin
	insert into usuarios values(@users,@pss)
end


---ejecutar el procedimiento
exec sp_insert_usuarios 'Luis','123'

select * from usuarios


---para la encriptacion
--borrar la tabla para cambiar el tipo de dato
drop table usuarios
go


--hacer los cambios a la tabla
create table usuarios(
usuario varchar(max),
clave varbinary(max))

--cambios en el procedimeinto
alter proc sp_insert_usuarios
@users varchar(max),
@pss varchar(max)
as
declare @pssb varbinary(max)
begin
		--aqui encripta en @pss
	set @pssb=(ENCRYPTBYPASSPHRASE('encriptacion',@pss));
	insert into usuarios values(@users,@pssb)
end

--ejecutar el procedimiento
exec sp_insert_usuarios 'Luis','123'
select * from usuarios

---para desencriptar
--agregar un campo a la tabla
drop table usuarios
go


--hacer los cambios a la tabla
create table usuarios(
usuario varchar(max),
clave varbinary(max),
llave varchar(max))

---modificar nuevamente el procedimeinto
--cambios en el procedimeinto
alter proc sp_insert_usuarios
@users varchar(max),
@pss varchar(max),
@key varchar(max)
as
declare @pssb varbinary(max)
begin
	set @pssb=(ENCRYPTBYPASSPHRASE(@key,@pss));
	insert into usuarios values(@users,@pssb,@key)
end


exec sp_insert_usuarios 'Luis','123','encriptacion'

select * from usuarios

---crear un procediento para desencriptacion
create proc sp_mirar_pss
@user varchar(max)
as
begin
	select *,libre=convert(varchar(max),DECRYPTBYPASSPHRASE(llave,clave)) from usuarios
end


exec sp_mirar_pss 'Luis'
