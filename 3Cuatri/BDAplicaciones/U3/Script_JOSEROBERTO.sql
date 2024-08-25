--creacion de login
create login JOSE with password='1234'
go
--una vez ejecutado ya podemos iniciar sesion
--crear usuario

use utstore
go
create user ROBERTO for login JOSE
go

grant select on clientes to ROBERTO
