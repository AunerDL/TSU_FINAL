/*
Llenado  de la base de datos 
tienditag4
*/

use tienditag4;

/*
llenado de tabla categoria
NOTA: primary key es autoincremental
*/
select * from categoria;

insert into categoria(codigo, nombre)
values('c1','Lacteos');
insert into categoria(nombre, codigo)
values('Carnes Frias','c2');
insert into categoria(codigo, nombre)
values('c3','Linea Blanca'), 
      ('c4','Abarrotes'),
      ('c5','Ropa');

/*
llenado de tabla producto (1:N)
NOTA: primari key compuesta 
*/

select * from producto;

insert into producto
values(1,'Acne','Refrigerador',45000,1000,500,10,1,3);
insert into producto
values(2,'Acne','Licuadora',45000,1000,500,10,1,3);
insert into producto
values(1,'Buena','Salchichas',34,1000,150,10,1,3);
insert into producto
values(2,'Buena','Chorizo',50,200,150,10,1,2);

/*
llenado de tabla empleado
NOTA:
*/
/*
llenado de tabla detalle-venta
NOTA:
*/
/*
llenado de tabla venta
NOTA:
*/