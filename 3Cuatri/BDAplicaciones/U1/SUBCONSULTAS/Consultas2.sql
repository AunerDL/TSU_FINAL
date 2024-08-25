use Northwind;
--1--
select*from Suppliers;
select*from Products;

select ProductID ,ProductName, UnitPrice from Products where SupplierID in
(select SupplierID from Suppliers where Country = 'USA');

--2--
select*from Customers;
select*from Products;
select*from [Order Details];
select*from Orders;
select*from Employees;
select ProductID, ProductName, UnitPrice from Products where ProductID in
(select ProductID from [Order Details] where OrderID in 
(select OrderID from Orders where CustomerID = 'ALFKI'));

select ProductName, UnitPrice from Products where ProductID in
(select ProductID from [Order Details] where OrderID in
(select OrderID from Orders where CustomerID = 'ALFKI'));

--3--
select*from Products;
select*from Suppliers;

select ProductID, ProductName, SupplierID from Products where SupplierID in
(select SupplierID from Suppliers where Country = 'USA');

--4--
select*from Products;
select*from Categories;

select CategoryID, ProductName from Products where CategoryID in
(select CategoryID from Categories where CategoryName = 'Condiments');

--5--
select*from Orders;
select*from [Order Details];

select OrderID, CustomerID from Orders where OrderID in
(select OrderID from [Order Details] where ProductID = 7);

--6--
select*from Territories;
select*from EmployeeTerritories;

select EmployeeID, TerritoryID from EmployeeTerritories where TerritoryID in
(select TerritoryID from Territories where RegionID = 4);

--7--
select*from Territories;
select*from Region;

select TerritoryID, TerritoryDescription from Territories where RegionID in
(select RegionID from Region where RegionDescription = 'Western');

--8--
select*from Employees;
select*from EmployeeTerritories;

select EmployeeID, LastName, FirstName from Employees where EmployeeID in
(select EmployeeID from EmployeeTerritories where TerritoryID = 01581);

--9--
select*from Employees;
select*from Orders;

select EmployeeID, LastName, FirstName from Employees where EmployeeID in
(select EmployeeID from Orders where ShipCountry = 'USA');

--10 lo mismo que la 9--
select*from Employees;
select*from Orders;

select EmployeeID, LastName, FirstName from Employees where EmployeeID in
(select EmployeeID from Orders where ShipCountry = 'USA');

--11--
SELECT*FROM Customers;
select*from Orders;

select OrderID, OrderDate, CustomerID from Orders where CustomerID in
(select CustomerID from Customers where Country = 'Mexico');

