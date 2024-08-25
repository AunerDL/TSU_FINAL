use Northwind;

---EJERCICIOS PDF 2


select UnitPrice,ProductID from Products
where UnitPrice < ANY (select UnitPrice from [Order Details]);


select UnitPrice,ProductID from Products
where UnitPrice > ANY (select UnitPrice from [Order Details]);


select * from Products;
select * from [Order Details];

select * from [Order Details] where Quantity=100;

 
 ---	El ANY ES PRA OPERADORES +-=

select ProductName from Products
where ProductID = ANY (Select ProductID from [Order Details] where Quantity>100);


select * from Products;
select * from [Order Details];


---		ALL FILAS DUPLICADAS


select ProductName from Products
WHERE UnitPrice < ALL (Select UnitPrice from Products where CategoryID=1);


Update Products
set ProductName = 'GABRIEL'
where ProductID in (Select ProductID from [Order Details] where ProductID=11);

select*from Products where ProductID = 3;

select*from [Order Details] where ProductID = 3;

select*from Orders where CustomerID = 'ALFKI';

select ProductName, UnitPrice from Products where ProductID in
(select ProductID from [Order Details] where OrderID in
(select OrderID from Orders where CustomerID = 'ALFKI'));

select*from EmployeeTerritories where TerritoryID = 30346;
select EmployeeID, TerritoryID from EmployeeTerritories where TerritoryID in
(select TerritoryID from Territories where RegionID = 4);

select TerritoryID from Territories where RegionID = 4;


--EJEMPLOS ORDER DETAILS--

--Filtrar por orderID--
select*from [Order Details] where OrderID = 10248;

--Filtrar por productID--
select*from [Order Details] where ProductID = 7;

--Filtrar por Quantity--
select*from [Order Details] where Quantity > 10;

--Filtrar por Precio unitario (UnitPrice)--
select*from [Order Details] where UnitPrice BETWEEN 5.00 AND 10.00;

--Filtrar por descuento (Discount)--
select*from [Order Details] where Discount > 0.05;

--Filtrar por orderID y ProductID--
select*from [Order Details] where OrderID = 10248 and ProductID = 7;


select EmployeeID,LastName, FirstName, Title, BirthDate, ReportsTo from Employees
where ReportsTo between 3 and 8;

--Filtrar por CategoryID 1 o 2--
select*from Products where CategoryID = 1 or CategoryID = 2;

--Filtrar por supplier distinto de 3--
select*from Products where not SupplierID = 3;

--Filtrar por productotos que contengan chai en el nombre o que tengan un precio superior a 20.00--
select*from Products where ProductName like '%chai%' or UnitPrice > 20.00;

--Filtrar por productos que no esten descontinuados y que tengan un precio menor o igual a 10.00--
select*from Products where not Discontinued = 1 and UnitPrice <= 10.00;


select [Order Details].OrderID, [Order Details].ProductID, Products.ProductName
from [Order Details] inner  join Products on [Order Details].ProductID = Products.ProductID;

select*from [Order Details];

select Suppliers.SupplierID, Suppliers.CompanyName, Products.ProductName
from Suppliers inner  join Products on Suppliers.SupplierID = Products.SupplierID;

select [Order Details].OrderID, [Order Details].ProductID, Orders.OrderDate
from [Order Details] inner join Orders on [Order Details].OrderID = Orders.OrderID;

select Products.ProductID, Products.ProductName, Categories.CategoryName
from Products inner join Categories on Products.CategoryID = Categories.CategoryID;

select [Order Details].OrderID, [Order Details].ProductID, Products.ProductName
from [Order Details]left outer join Products on [Order Details].ProductID = Products.ProductID;

select Products.ProductID, Products.ProductName, Suppliers.CompanyName
from Products left outer join Suppliers on Products.SupplierID = Suppliers.SupplierID;

select Products.ProductID, Products.ProductName, Suppliers.CompanyName
from Products left outer join Suppliers on Products.SupplierID = Suppliers.SupplierID;

select Products.ProductID, Products.ProductName, Categories.CategoryName
from Products left outer join Categories on Products.CategoryID = Categories.CategoryID;

select [Order Details].OrderID, [Order Details].ProductID, orders.OrderDate
from [Order Details] left outer join Orders on [Order Details].OrderID = Orders.OrderID;

select [Order Details].OrderID, [Order Details].ProductID, Products.ProductName
from [Order Details] right outer join Products on [Order Details].ProductID = Products.ProductID;

select [Order Details].OrderID, [Order Details].ProductID, Products.ProductName
from [Order Details] cross join products;

select*from [Order Details];
select*from Products;

select OrderID, ProductID, null as ProductName from [Order Details]
union select null as OrderID, ProductID, ProductName from Products;

