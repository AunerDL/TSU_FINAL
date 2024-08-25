-- Crear la base de datos "empresa"
CREATE DATABASE enterprice
go

-- Usar la base de datos "empresa"
USE enterprice
go

-- Crear la tabla "productos"
CREATE TABLE productos (
    idp INT PRIMARY KEY,
    nombre VARCHAR(100),
    precio DECIMAL(10,2),
    descripcion VARCHAR(255)
)

-- Añadir datos
INSERT INTO productos VALUES (1,'Pantalon',325.00,'Pantalon de vestir para dama')
INSERT INTO productos VALUES (2,'Blusa',225.00,'Blusa de vestir para dama')
INSERT INTO productos VALUES (3,'Falda',200.00,'Falda larga para dama')
INSERT INTO productos VALUES (4,'Zapatos',800.00,'Zapatillas para dama')
INSERT INTO productos VALUES (5,'Chamarra',950.00,'Chamarra de piel para dama')
INSERT INTO productos VALUES (6,'Camisa',600.00,'Camisa de vestir para caballero')
INSERT INTO productos VALUES (7,'Playera',100.00,'Playera de color para caballero')
INSERT INTO productos VALUES (8,'Calcetines',80.00,'Calcetines de vestir para caballero')
INSERT INTO productos VALUES (9,'Saco',700.00,'Saco sport para caballero')
INSERT INTO productos VALUES (10,'Bufanda',75.00,'Bufanda tejida color azul')


-- Crear la tabla "compras"
CREATE TABLE Gabriel (
    idc INT PRIMARY KEY,
    producto_id INT,
    cantidadc INT,
    fecha_comprac DATE,
    FOREIGN KEY (producto_id) REFERENCES productos(idp)
);

-- Crear la tabla "ventas"
CREATE TABLE De_Jesus (
    idv INT PRIMARY KEY,
    producto_id INT,
    cantidadv INT,
    fecha_ventav DATE,
    FOREIGN KEY (producto_id) REFERENCES productos(idp)
);

-- Crear la tabla "almacen"
CREATE TABLE Ortiz (
    ida INT PRIMARY KEY,
    producto_id INT,
	cantidadc INT,
	cantidadv INT,
    stock INT,
    FOREIGN KEY (producto_id) REFERENCES productos(idp)
);



		--inicia transaccion

begin tran
--hace insertar
insert into Gabriel(idc, producto_id, cantidadc, fecha_comprac) values(2,2,10,getdate());
--confirmar la transaccion o no dependiendo el ERROR
if (@@ERROR=0)
	begin
		--confirmar
		commit
	end
else
	begin
		rollback
		print 'FFFF';
	end


		--Iniciar la transaccion para primer registro
		--en la tabla almacen

begin tran
--declara variable entera
declare @cantidadc int
--obtener la ccantidad de la tabla compras
select @cantidadc = cantidadc from Gabriel
--insertar nuevo registro en la tabla almacen, con la cantidad obtenida
insert into Ortiz(ida, producto_id,cantidadc,cantidadv,stock) 
values(2,2,@cantidadc,0,@cantidadc);
commit tran

select*from Ortiz;
select*from Gabriel;

		--Iniciar la transaccion para el segundo
		--registro en la tabla almacen y con los demas

begin transaction
	declare @cantidadc int
	declare @producto_id int
	declare @stock int
	declare @stock1 int
	declare @ida int
--obtener la cantidad y el
--producto_id de las tabla compras
select @cantidadc = cantidadc , @producto_id= producto_id from Gabriel; 
select @stock1 = stock from Ortiz;
--cuando ya existe el producto
select @ida = ida from Ortiz
select @stock = @cantidadc + @stock1;
--verificar si el producto ya existe en almacen
if exists (select 1 from Ortiz where producto_id = @producto_id)
	begin
		update Ortiz set cantidadc = @cantidadc + cantidadc, stock = @stock where producto_id = 1
		print 'EL PRODUCTO YA EXISTE EN LA TABLA "ALMACEN". TRANSACCION ACTUALIZADA'
		return;
	end
	insert into Ortiz(ida,producto_id,cantidadc,cantidadv,stock) values(2,2,@cantidadc,0,@stock);
	commit tran;





		--Iniciar transaccion de ventas

begin tran
insert into De_Jesus(idv,producto_id,cantidadv,fecha_ventav) values(2,1,5,getdate());

if (@@ERROR=0)
	begin

		commit
	end
else
	begin
		rollback
		print 'FFFF';
	end


begin tran
declare @cantidadV int
select @cantidadV = cantidadv from De_Jesus
insert into Ortiz(ida, producto_id,cantidadc,cantidadv,stock) 
values(1,1,@cantidadV,0,@cantidadV);
commit tran;




begin transaction
	declare @cantidadV int
	declare @ProductoId int
	declare @stock_ int
	declare @Stock2 int
	declare @idv int
select @cantidadV = cantidadv , @ProductoId = producto_id from De_Jesus; 
select @Stock2 = stock from Ortiz;
select @idv = ida from Ortiz
select @stock_ = @Stock2 - @cantidadV;

if exists (select 1 from Ortiz where producto_id = @ProductoId)
	begin
		update Ortiz set cantidadc = @cantidadV + cantidadc, stock = @stock_ where producto_id = 1
		print 'EL PRODUCTO YA EXISTE EN LA TABLA "ALMACEN". TRANSACCION ACTUALIZADA'
		return;
	end
	insert into Ortiz(ida,producto_id,cantidadc,cantidadv,stock) values(1,1,@cantidadV,0,@stock_);
	commit tran;



select*from ortiz;
select*from de_jesus;
select*from Gabriel;
select*from de_jesus;
select*from ortiz;

drop table ortiz;
drop table de_jesus;
drop table gabriel;