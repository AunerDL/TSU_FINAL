use utstore;

--Examen--

select*from productos;
select*from proveedores;
select*from detalle;

--1--
create nonclustered index IDX_detalles on detalle(producto);
create nonclustered index IDX_provedor on proveedores(nompv);
create nonclustered index IDX_producto on productos(nompro);

--3--
select*from ventas;
select*from clientes;
select*from sucursales;

create view vista_ventas as
select idvta, empleado, fecha from ventas where tpago='EFECTIVO';
select * from vista_ventas;

create view vista_cliente as
select nomcli, pais, edad from clientes where pais='MEXICO';
select*from vista_cliente;

create view vista_sucursal as
select nombre, idsuc, lugar from sucursales where lugar='EUA';
select*from vista_sucursal;

--4--
select*from ventas;
select*from clientes;
select*from sucursales;

select idvta, tpago, fecha from ventas where empleado=2;
select idcli, nomcli, fecnac from clientes where nomcli='EDUARDO SALAS';
select nombre, lugar from sucursales where idsuc=1; 

--5--
select*from ventas;
select*from clientes;
select clientes.idcli, clientes.nomcli
from Clientes where clientes.idcli 
in(select ventas.cliente from ventas where clientes.idcli=ventas.cliente);

select*from productos;
select nompro, precio, stock from productos
where stock in(100, 300, 80);

--6--
select*from productos;
select nompro, idpro, precio from productos
WHERE nompro like 'A%';

select*from clientes;
select pais, nomcli, idcli from clientes
where pais like '%A';

--7--
select*from productos;
select idpro, nompro, stock from productos
where nompro like '%T' or stock = 200;

--8--
select*from empleados;
select direccion, nomemp, sueldo from empleados 
where nomemp between '%Z' and 'O%';

--9--
select*from productos;
select*from proveedores;
select productos.idpro, productos.nompro, proveedores.idpv
from productos inner join proveedores on productos.proveedor = proveedores.idpv;

select*from productos;
select*from categorias;
select productos.idpro, productos.nompro, categorias.nomcat
from productos inner join categorias on productos.categoria = categorias.idcat;

select*from ventas;
select*from clientes;
select ventas.idvta, ventas.cliente, clientes.nomcli
from ventas inner join clientes on ventas.cliente = clientes.idcli;

select*from ventas;
select*from empleados;
select ventas.idvta, ventas.cliente, empleados.nomemp
from ventas inner join empleados on ventas.empleado = empleados.idemp;
