use BD_Gabriel;
go

--select
select*from ALUMNOS;

--INSERT
INSERT INTO ALUMNOS VALUES('Gabriel',10.00,'TIDSM');
INSERT INTO ALUMNOS VALUES('Alan',10.00,'TIDSM');

--update
update ALUMNOS set nombre='BrianN' where idalu=3;