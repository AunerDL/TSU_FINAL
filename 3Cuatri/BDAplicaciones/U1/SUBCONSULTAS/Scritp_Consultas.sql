use Northwind;

select * from Products;
select * from Categories;

select ProductID, ProductName, CategoryID from Products where CategoryID in 
(select CategoryID from Categories where CategoryName = 'Beverages'); 

select ProductID, ProductName, CategoryID from Products where CategoryID in 
(select CategoryID from Categories where CategoryName = 'Beverages' or CategoryName = 'Produce'); 

select EmployeeID, LastName, FirstName, Title Address from Employees where Title in 
('Vise President, Sales', 'Sales Manager'); 

select*from [Order Details];
select*from Orders;
select ProductID, OrderID, Quantity from [Order Details] where OrderID in 
(select OrderID from Orders where ShipVia = 3); 
