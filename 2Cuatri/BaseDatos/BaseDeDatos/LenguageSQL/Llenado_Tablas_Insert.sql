/*
Llenado de la base de datos tienditaG4
*/

use tiendita_g4_1;

/*Llenado de tabla categoria
Nota: La primary key es autoincrement
*/

select *from categoria;

insert into categoria (codigo, nombre)
values('c1', 'Lacteos');

insert into categoria (nombre, codigo)
values('Carnes Fria', 'c3');

insert into categoria (codigo, nombre)
values('c4', 'Linea Blanca'),
('c5', 'Abarrotes'),
('c6', 'Ropa');

/*Llenado de tabla producto (1:N)
Nota: tiene una primary compuesta
*/
select *from producto;

insert into producto
values(1, 'Acme', 'Refrigerador', 45000, 1000, 500, 10, 1, 4);

insert into producto
values(2, 'Acme', 'Licuadora', 45000, 1000, 500, 10, 1, 4);

insert into producto
values(2, 'Buena', 'Chorizo', 34, 300, 500, 10, 1, 3);

/*Llenado de tabla empleado

*/


/*Llenado de tabla cliente

*/

/*Llenado de tabla venta

*/

/*Llenado de tabla detalle de venta

*/

/*Llenado de tabla contacto

*/