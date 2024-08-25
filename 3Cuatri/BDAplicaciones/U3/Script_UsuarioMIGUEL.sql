--creacion de login
create login MIGUEL with password='1234'
go
--una vez ejecutado ya podemos iniciar sesion
--crear usuario
use utstore
go
create user MIGUEL for login MIGUEL
go
--eliminar login
--drop login miguel
--eliminar usuario
--drop user miguel
--grant y revoke
grant select on alumno to MIGUEL
revoke select on alumnos from MIGUEL

--asignar o revocar todos los privilegios
grant all on alumnos to MIGUEL
revoke all on alumnos from MIGUEL

--roles a los alumnos
alter role db_datareader add MEMBER MIGUEL
alter role db_datawriter add MEMBER MIGUEL

--eliminar rol
alter role db_datareader drop MEMBER MIGUEL