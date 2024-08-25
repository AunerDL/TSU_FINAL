-- 1crear base de datos con tu nomre
create database [BD_Gabriel]
use BD_Gabriel
go

--2 crear tablas
create table ALUMNOS
(idalu int identity(1,2) primary key,
nombre varchar(45),
promedio decimal(10,2),
carrera varchar(45)
);
go

--3 crear login con tu_nombre_examen
-- se crea el login con su contraseña (el nombre del login y del usuario puede ser cualquiera)
--primero ejecutas el create login
 create login Gabriel_Examen with password='1213'
 GO

--4 crear usuario llamado empleado
-- despues ejecutas este comando
use BD_Gabriel
create user Empleado for login Gabriel_Examen
GO

--5 agregar permisos select, insert y update
--estos son los permisos
--por ultimo ejecutas este comando
grant select on ALUMNOS to Empleado
grant insert on ALUMNOS to Empleado
grant update on ALUMNOS to Empleado
go		

--antes de ejecutar el revoke ingresas al usuario creado
--despues de realizar los permisos en el otro usuario usas el revoke para revocar los permisos

--6 revocar permisos
revoke all on ALUMNOS from Empleado
