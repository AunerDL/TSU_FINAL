use Northwind;

select*from products;

--condiciones--
select*from products where productName = 'Chai' and SupplierID = 1;
select*from products where productName = 'Chai' or ProductName = 'Chang' or productName = 'Tofu';
select*from products where ProductName in
('Chai','Chang','Tofu');
select*from products where UnitPrice > 100;
select*from products where unitPrice > 100 and unitPrice < 300;
select*from products where UnitPrice between 100 and 300; 

--comodines--
select*from products where productName like 'Q%';
select*from products where productname like '%o';
select*from products where productname like '%b%';
select*from products where productname like '____';
select*from products order by productname desc;
select*from products order by productname asc;

--agrupacion--
select SupplierID, COUNT(SupplierID) as Cantidad 
from products group by SupplierID;
select*from [Order Details];
select orderID, count(orderID) as cantidad from [Order Details]
group by orderID having count(OrderID)>2 order by cantidad;

select*from products;
select*from categories;
select*from [Order Details];
select*from suppliers;

--subconsulta con 4 tablas--
select ProductID, ProductName, CategoryID,
	  (select categoryName from Categories where CategoryID = products.CategoryID),
	  (select companyName from Suppliers where supplierID = products.supplierID) as proveedor,
	  (select sum(unitprice) from [Order Details] where productID = products.ProductID) Precio
from Products order by productID;

select products.productID, products.ProductName, products.CategoryID, categories.CategoryName
as Categoria, Suppliers.CompanyName as Provedor, sum([Order Details].unitprice) as Precio
from products join categories on products.categoryID = categories.categoryID join Suppliers
on products.SupplierID = Suppliers.SupplierID JOIN [Order Details] on products.ProductID =
[Order Details].ProductID group by Products.ProductID, products.productName, Products.CategoryID,
categories.categoryname, suppliers.CompanyName;

select*from employees;

select convert(nvarchar(2), employeeID) + '' + lastName + '' + firstName as 'nombre'
from employees;

use Northwind;

select CustomerID, EmployeeID, OrderDate, ShipName,
	  (select ContactName from Customers where CustomerID = Orders.CustomerID) as Contactos,
	  (select FirstName from Employees where employeeID = Orders.EmployeeID) as Empleado
from Orders order by OrderID;

--tablas consultadas--
select*from orders;
select*from customers;
select*from Employees;

create nonclustered index IDX_Employee on Employees (Title);

create nonclustered index IDX_Employee2 on Employees (PostalCode);

create view Vista_Employee as
select Title, HireDate, BirthDate from Employees where EmployeeID=2;

select * from Vista_Employee;

create view Vista_Employee2 as
select PostalCode, Country, Extension from Employees where EmployeeID=3;
select * from Vista_Employee2;