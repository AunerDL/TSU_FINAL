
--Examen Gabriel Eduardo


use Empresa

select*from USUARIOS


--iNSERTAR
insert USUARIOS values('EXAMEN','EXAMEN',encryptbypassphrase('PASSWORD','examen'));

--DESENCRIPTAR
SELECT USUARIO , PASSWORD_SIN_ENCRIPTAR,
	convert(varchar (255),decryptbypassphrase('PASSWORD',PASSWORD_ENCRIPTADO))
FROM USUARIOS;