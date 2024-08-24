/*
Consultas de Agregado (sum, avg, count(), count(*), min, max)

*/

-- Seleccionar cuantos productos hay
select count(*) as 'Total productos' from productos;

use bdejemplo;

-- Cual es la cuota media de todos los representantes

select * from representantes;
select avg(cuota) as 'cuota media' from representantes;

-- Cual es la cuota media y las ventas medias de cada uno de los representantes
select avg(cuota) as 'cuota medioa', avg(ventas) as 'ventas medias' from representantes;

-- Cual es el rendimiento medio de la cuota de los representantes
-- ventas / cuota * 100
select avg(100*(ventas/cuota)) as rendimiento from representantes; 
select avg(ventas/cuota*100) as rendimiento from representantes; 

-- Cuales son las cuotas y ventas totales de todos los representantes
select sum(cuota) as 'cuotas totales', sum(ventas) as 'ventas totales' from representantes;

-- Cuales es el total de importes de los pedidos de Bruno Arteaga
select * from representantes;
select * from pedidos;
select sum(importe) as 'total importe' from pedidos where rep = 105;
select sum(importe) as p inner join representantes as r on  p.rep = r.Num_empl where r.Nombre = 'Bronu Arteaga';

use northwind;

-- Mostrar el importe total de las ordenes
select * from orderdetails;
select sum(unitprice * quantity) as 'importe total' from orderdetails;

select sum(unitprice * quantity) as 'importe total' from orderdetails where orderid = 10248;
select sum(unitprice * quantity) as 'importe total' from orderdetails where orderid = 10248 and productid = 11;
select sum(unitprice * quantity) as 'importe total' from orderdetails where productid = 11;

use bdejemplo;

-- Calcular el precio medio del los productos del frabricante ACI
select * from productos;
select avg(Precio) as 'Precio medio' from productos where Id_fab = 'ACI';

-- Calcular el importe medio de los pedidos de Acme
select * from pedidos;
select * from clientes;
select avg(importe) as 'Importe medio' from pedidos where cliente = 2103;

-- Cuales son las cuotas mayor y menor asignadas
select min(cuota) as 'cuota minimo', max(cuota) as 'cuota maxima' from representantes;

-- Cual es la fecha mas antigua de un pedido
select * from pedidos;
select min(fecha_pedido) as 'fecha mas antigua' from pedidos;
use northwind;
select * from orders;
select min(orderdate) as 'fecha mas antigua' from orders;

-- Cual es el mejor rendimiento en ventas de los representantes
use bdejemplo;
select max(100*(ventas/cuota)) as rendimiento from representantes; 

-- Cuantos clientes hay
select * from clientes;
select count(Num_cli) as 'clientes total' from clientes;
select count(*) as 'clientes total' from clientes;
use northwind;
select count(*) as 'clientes total' from customers;

use bdejemplo;
-- Cuantos representantes exceden su cuota
select * from representantes;
select count(*) as 'exceden su cuota' from representantes where ventas>cuota;

-- Cuantos pedidos de mas de 25000 estan rejistrados
select count(*) as 'mas de 25000' from pedidos where importe > 25000;

-- Cuantos puestos tienen los representantes
select * from representantes;
select count(distinct puesto) from representantes;

#Group by
select rep, sum(importe) from pedidos group by rep;
