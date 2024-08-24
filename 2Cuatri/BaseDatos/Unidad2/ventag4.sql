# Construir una base de datos ventasg4

/* 

SQL-LDD (create, alter, drop)

create - Crea  objetos de la base de datos
alter - Modifica los objetos de la base de datos
drop - Elimina objetos  de la base de datos

*/

#Crear la base de datos
create database ventag4;

#utilizar la base de datos 
use ventag4;

#Crear la tabla categoria
create table categoria( idcategoria int not null auto_increment,
 nombre varchar(80) not null, constraint pk_categoria primary key(idCategoria),
 constraint unique_nombre_categoria unique(nombre))engine innodb;
 
 #Crear la tabla producto
 
 create table producto (idproducto int not null auto_increment, nombre varchar(80) not null, 
 precio decimal(10,2) not null, stock int not null, idcategoria int not null, constraint pk_producto primary key(idproducto), 
 constraint unique_nombre_producto unique(nombre), constraint chk_precio check(precio >= 0.0 and precio <= 100000),
 constraint chk_stock check(stock > 5), constraint fk_producto_categoria foreign key(idcategoria) references categoria(idcategoria)
 )engine innodb;
 
 #SQL - LMD (Lenguaje de manipulacion de datos)
 /*
 Actualizar los datos o la informacion
 
 insert
 update
 delete
 select
 
 */
 
 insert into categoria(nombre) values ('Lacteos');
 
 insert into categoria(nombre) values ('Abarrotes');
  
 insert into categoria(nombre) values ('Linea blanca');
   
 insert into categoria(nombre) values ('Panaderia');
    
update categoria set idcategoria = 2 where idcategoria = 3;
 
 select * from categoria;
 
 
 
