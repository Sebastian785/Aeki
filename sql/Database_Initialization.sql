DROP DATABASE test1;

CREATE DATABASE test1;

USE test1;

CREATE TABLE test1.dbo.Customer (
	id int IDENTITY(1,1) NOT NULL,
	Name nvarchar(20) DEFAULT (NULL),
	PRIMARY KEY (id)
);

CREATE TABLE test1.dbo.FlavorType (
	id int IDENTITY(1,1) NOT NULL,
	FlavorName nvarchar(50) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE test1.dbo.Membership (
	id int IDENTITY(1,1) NOT NULL,
	ProductCategoryID int NOT NULL,
	customerId int NOT NULL,
	discount int,
	PRIMARY KEY (id)
);

CREATE TABLE test1.dbo.OrderList (
	orderId int IDENTITY(1,1) NOT NULL,
	name varchar(50),
	customerId int,
	PRIMARY KEY (orderId)
);

CREATE TABLE test1.dbo.Product (
	id int IDENTITY(1,1) NOT NULL,
	ProductCategoryID int NOT NULL,
	ProductName nvarchar(50) NOT NULL,
	Amount int NOT NULL,
	Description varchar(50) NOT NULL,
	Price int NOT NULL,
	DiscountPrice int,
	OrderId int,
	PRIMARY KEY (id)
);

CREATE TABLE test1.dbo.ProductCategories (
	id int IDENTITY(1,1) NOT NULL,
	CategoryName varchar(50) NOT NULL,
	ProductDetailsID int NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE test1.dbo.ProductDetails (
	id int IDENTITY(1,1) NOT NULL,
	Number nvarchar(50),
	Weight nvarchar(50),
	Color nvarchar(50),
	FlavorTypeID nvarchar(50),
	PRIMARY KEY (id)
);

INSERT INTO test1.dbo.Customer(Name) VALUES (N'Sebi');

INSERT INTO test1.dbo.Customer(Name) VALUES (N'Claudiu');

INSERT INTO test1.dbo.Customer(Name) VALUES (N'Razvan');

INSERT INTO test1.dbo.FlavorType(FlavorName) VALUES (N'Chili');

INSERT INTO test1.dbo.FlavorType(FlavorName) VALUES (N'Sweet');

INSERT INTO test1.dbo.Membership(ProductCategoryID, customerId, discount) VALUES (1, 1, 20);

INSERT INTO test1.dbo.OrderList(name, customerId) VALUES (N'Order 1', 1);

INSERT INTO test1.dbo.Product(ProductCategoryID, ProductName, Amount, Description, Price, DiscountPrice, OrderId) VALUES (1, N'Chair', 2, N'Big chair', 10, 20, 1);

INSERT INTO test1.dbo.Product(ProductCategoryID, ProductName, Amount, Description, Price, DiscountPrice, OrderId) VALUES (2, N'Hot Dog', 1, N'Small Hot Dog with Ketckup', 5, 15, 1);

INSERT INTO test1.dbo.ProductCategories(CategoryName, ProductDetailsID) VALUES (N'Furniture', 1);

INSERT INTO test1.dbo.ProductCategories(CategoryName, ProductDetailsID) VALUES (N'Textile', 2);

INSERT INTO test1.dbo.ProductCategories(CategoryName, ProductDetailsID) VALUES (N'Hot Dogs', 3);

INSERT INTO test1.dbo.ProductDetails(Number, Weight, Color, FlavorTypeID) VALUES (N'1', N'5', null, null);

INSERT INTO test1.dbo.ProductDetails(Number, Weight, Color, FlavorTypeID) VALUES (N'2', null, N'Red', null);

ALTER TABLE test1.dbo.OrderList
	ADD FOREIGN KEY (customerId)
	REFERENCES dbo.Customer (id)