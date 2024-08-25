--1 crear login
--2 crear usuario
--3 acceso a roles

--#CREAR LOGIN Y USUARIO CON PERMISOS DE CADA BASE DE DATOS
--#POR CADA USUARIO ESTABLECER 2 GRANT O 2 ROLES

--BASES DE DATOS
--1 BANCO
--2 ESCUELA
--3 UTSTORE
--4 INVENTARIO
--5 NORTHWIND


		--USUARIO Y LOGIN DE BANCO

create login MELCHOR with password='789'


use bancos
create user MIGUEL for login MELCHOR

grant select on banco to MIGUEL
grant delete on banco to MIGUEL
go


		--USUARIO Y LOGIN DE ESCUELA

create login DIAS with password='789'

use Escuela
create user NESTOR for login DIAS

grant select on Alumnos to NESTOR
grant delete on Alumnos to NESTOR
go		

		--USUARIO Y LOGIN DE UTSTORE

create login MANUEL with password='789'

use utstore
create user SOLA for login MANUEL

grant select on clientes to SOLA
grant select on bitacora to SOLA
go


		--USUARIO Y LOGIN DE INVENTARIO

create login CAMACHO with password='789'

use inventario
create user EMMANUEL for login CAMACHO

grant select on productos to EMMANUEL
grant select on ventas to EMMANUEL
go


		--USUARIO Y LOGIN DE NORTHWIND

create login TRIX with password='789'

use Northwind
create user ADMINS for login TRIX

grant select on categories to ADMINS
grant insert on categories to ADMINS
go