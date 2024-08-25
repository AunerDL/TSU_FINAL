
		--Cambio de nombre de usuario y de login
	--nombre login_cuatro
	--nombre usuario_cinco

create login [CUATRO] with password='1234',
default_database=[MASTER],
check_expiration=off,
check_policy=off 
go

-- creacion de todoslos usuarios y logins es en la principal

create user [CINCO]
for login [CUATRO] with default_schema=[dbo]
go

use Northwind;
go

select u.name [USUARIO], sl.name[LOGIN] from  sys.sysusers u
join sys.syslogins sl on sl.sid =u.sid
where u.sid <= 10
go

--para ejecutar el codigo se necesita ejecutar el create user CINCO
--dar permiso para seleccionar tablas
use Northwind
go
grant select to[CINCO]
GO

--dar permiso para crear tablas
use Northwind
grant create table to[CINCO]
go

--todo el codigo para dar permisos y crear usuario y login se debe ejecutar todo al mismo tiempo