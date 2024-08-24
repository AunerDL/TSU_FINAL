use bdejemplo;

#Seleccionar todas las oficinas

select * from oficinas;

/*Seleccionar todas las oficinas ccon la ciudad, objetivos y ventas
*/
select ciudad, objetivo, ventas from oficinas;

select objetivo, ciudad, ventas, region from oficinas;	

#Columnas calculadas
 /*
 mostrar el   numero  de fabricante, el numero de producto, la descripcion y el valor del inventario de cada producto
 */
 select id_fab, id_producto 'Numero producto', descripcion, 
 precio, stock, (precio * stock) as 'Valor inventario' from productos;

/*
listar nombre, la fecha de contratacion, el año de contratacion, el mes el dia de los empleados
*/
select nombre, fecha_contrato, year(fecha_contrato) as 'Año', 
month(fecha_contrato) as 'Mes', day(fecha_contrato) as 'Dia' 
from representantes;

/*
Mostrar los resultados si se aumenta la cuota de cada representante en un 3% de las ventas
*/

select Nombre, Cuota, Ventas, (Couta + 0.03 * Ventas) as 'Aumento cuota' 
from representantes order by nombre  desc;

select * from oficinas;
select * from representantes;

select jef from oficinas;
#Clausula distinct Elimina filas duplicadas

select distinct jef from oficinas;

# Seleccion de filas clausula where

/*
 1. test de comparacion
2. test de rango
3. test de pertenencia a conjuntos
4. test de encaje de patrones
5. test de valores nulos
*/

#Test de comparacion (Operadores relacionales <, >, <=, >=, <> o !=, =)

 /*
 Hallar los representantes contratados antes de 1998
 */
 use bdejemplo;
 select Nombre, year(Fecha_Contrato) as 'Año' from representantes where year( Fecha_Contrato)<1998;
 
 select * from representantes where fecha_contrato < '1998-01-01';
 
 /*
 listar las oficinas cuyas ventas estan por debajo del 80% de sus objetivos
 */
 
 select * from oficinas where ventas < (0.80*objetivo);
 
 /*
 listar las oficinas que no esten esten dirijidas por el empleado 108
 */
 
select * from oficinas where jef!=108; 
select * from oficinas where jef<>108; 

/*
Listar lo representantes que exeden su cuota
*/

select * from representantes where ventas > cuota;

#El test de Rango (Between)

/*
Hallar los pedidos del ultimo trimestre de 1989
*/
select * from pedidos ;
select * from pedidos where fecha_pedido between '1989-10-01' and '1989-12-31';

/*
Hallar los representantes cuyas ventas no  se encuentran entre el 80%
y el 120% de su cuota
*/

select * from representantes where ventas not between cuota * 0.80 and cuota * 1.20;
select * from representantes where not (ventas >= cuota * 0.80 and ventas<=cuota*1.20);

/*
Hallar dos pedidos que se encuentren entre varios rangos de importe, mostrar el numero de pedidos y el
importe (3 consultas) utilizar un alias de comuna para en numero de pedido
*/
select num_pedido as 'Numero', importe from pedidos where importe between 2000 and 34000;
select num_pedido as 'Numero', importe from pedidos where importe>=2000 and importe <=34000;

#Test de pertenencias a conjuntos (IN)

/*
Listar los representantes que trabajan en Navarra, Almeria o damiel
*/
select * from representantes;
select * from oficinas;
select * from representantes where oficina_rep in(11, 13, 22);
select * from representantes where oficina_rep = 11 or oficina_rep = 13 or oficina_rep = 22;

/*
Hallar todos los pedidos de los jueves de enero de 1990
*/
select * from pedidos;
select * from pedidos where Fecha_Pedido in('1990-01-4','1990-01-11','1990-01-18','1990-01-25');
select * from pedidos where Fecha_Pedido='1990' in (day(Fecha_pedido)='4' or day(Fecha_Pedido)='11' 
or day(Fecha_Pedido)='18' or day(Fecha_Pedido)='25')= month(Fecha_Pedido)='01';

-- Test de pertenencia de patrones (Like)

-- Seleccionar todas las empresas que comiencen con A 
select * from clientes where empresa like 'a%';
select * from clientes where empresa like 'aa%';

-- Seeleccionar todos los clientes que terminen con S 
select * from clientes where empresa like '%s';
select * from clientes where empresa like '%es';

-- Seleccionar todos lo clientes que tengan la palabra ri
select * from clientes where empresa like '%ri';
select * from clientes where empresa like 'a%s';
select * from clientes where empresa like 's% S.A.';
select * from clientes where empresa like '_____';
select * from clientes where empresa like 'Si__%';

-- Test de valores nulos (is null)

-- Buscar los representantes que no tengan aun oficina asignada
select * from representantes;
select * from representantes where oficina_rep is null;

-- Buscra los repesentantes que tengan oficina asignada
select * from representantes where oficina_rep is not null;

-- Condiciones compuestas de busqueda (and or y not)

-- Hallar los representantes que sus ventas esten debajo de su cuota o con 
-- ventas por debajo de 300000
select * from representantes where ventas < cuota or ventas < 300000;

-- Hallar los representantes que sus ventas esten debajo de su cuota pero que sus
-- ventas no esten por debajo de 150000
select * from representantes where ventas < cuota and ventas > 150000;

-- Hallar todos los representantes que o bien:
-- a) trabajan en Daimiel, Navarra o Castellon;
-- o bien b) no tienen jefe y estan contratados desde junio de 1988
-- o c) superan su cuota pero tienen ventas de 600000 o menos

select * from representantes;
select * from oficinas;
select * from representantes where (Oficina_Rep = (12 or 11 or 22)) 
or (Jefe is null and Fecha_Contrato='1988-06-01'and'1988-06-30')
or (ventas > cuota and ventas<=600000);

select * from representantes where (Oficina_Rep in (22,11,12))
or (jefe is null and Fecha_Contrato>='1988-06-01')
or (ventas > cuota and ventas <= 600000);

-- Ordenacion de los resultados (clausulas order by)

-- Mostrar las ventas de cada oficin, odenadas alfabeticamente por region
select ciudad, region, ventas from oficinas order by region ;
select ciudad, region, ventas from oficinas order by ventas ;
select ciudad, region, ventas from oficinas order by ventas ASC;
select ciudad, region, ventas from oficinas order by ventas DESC;
select ciudad, region, ventas from oficinas order by 1 desc;
select ciudad, region, ventas from oficinas order by 3 desc; 

-- Mostrar las ventas de cada oficin, odenadas alfabeticamente por region y
-- dentro de cada region por ciudad
select ciudad, region, ventas from oficinas order by region desc, ciudad;
select ciudad, region, ventas from oficinas order by ciudad desc, region;
select ciudad, region, ventas from oficinas order by region desc, ciudad desc;
select ciudad, region, ventas from oficinas order by 2 desc, 1 desc;
select ciudad, region, ventas from oficinas order by region desc, ciudad desc, ventas;


