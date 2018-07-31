CREATE TABLE aeki.dbo.Customer (
	id int IDENTITY(1,1) NOT NULL,
	Name nvarchar(50),
	MembershipID int
)
GO

CREATE TABLE aeki.dbo.FlavorType (
	id int IDENTITY(1,1) NOT NULL,
	FlavorName nvarchar(50) NOT NULL,
	PRIMARY KEY (id)
)
GO

CREATE TABLE aeki.dbo.Membership (
	id int IDENTITY(1,1) NOT NULL,
	ProductCategoryID int NOT NULL,
	PRIMARY KEY (id)
)
GO

CREATE TABLE aeki.dbo."Order" (
	orderId int IDENTITY(1,1) NOT NULL,
	name varchar(50),
	customerId int,
	PRIMARY KEY (orderId)
)
GO

CREATE TABLE aeki.dbo.Product (
	id int IDENTITY(1,1) NOT NULL,
	ProductCategoryID int,
	ProductName nvarchar(50),
	Amount int,
	Description varchar(50),
	Price int,
	DiscountPrice int,
	OrderId int,
	PRIMARY KEY (id)
)
GO

CREATE TABLE aeki.dbo.ProductCategories (
	id int IDENTITY(1,1) NOT NULL,
	CategoryName varchar(50),
	ProductDetailsID int,
	PRIMARY KEY (id)
)
GO
CREATE TABLE aeki.dbo.ProductDetails (
	id int IDENTITY(1,1) NOT NULL,
	Number int NOT NULL,
	Weight int NOT NULL,
	Color nvarchar(50) NOT NULL,
	FlavorTypeID int NOT NULL,
	PRIMARY KEY (id)
)
GO
SET IDENTITY_INSERT aeki.dbo.Customer ON
GO
INSERT INTO aeki.dbo.Customer(Name, MembershipID, id) VALUES (N'Sebi', 1, 1)
GO
INSERT INTO aeki.dbo.Customer(Name, MembershipID, id) VALUES (N'Claudiu', 0, 2)
GO
INSERT INTO aeki.dbo.Customer(Name, MembershipID, id) VALUES (N'Razvan', 2, 3)
GO
INSERT INTO aeki.dbo.Customer(Name, MembershipID, id) VALUES (N'Vasi', 0, 4)
GO
INSERT INTO aeki.dbo.Customer(Name, MembershipID, id) VALUES (N'gggggg', 4, 5)
GO
INSERT INTO aeki.dbo.Customer(Name, MembershipID, id) VALUES (N'eteteet', 3, 6)
GO
INSERT INTO aeki.dbo.Customer(Name, MembershipID, id) VALUES (N'gggggg', 4, 7)
GO
INSERT INTO aeki.dbo.Customer(Name, MembershipID, id) VALUES (N'gggggg', 4, 8)
GO
INSERT INTO aeki.dbo.Customer(Name, MembershipID, id) VALUES (N'sssdsds', 10, 9)
GO
SET IDENTITY_INSERT aeki.dbo.Customer OFF
GO
INSERT INTO aeki.dbo.FlavorType(id, FlavorName) VALUES (1, N'Chili')
GO
INSERT INTO aeki.dbo.FlavorType(id, FlavorName) VALUES (2, N'Sweet')
GO
INSERT INTO aeki.dbo.Membership(id, ProductCategoryID) VALUES (1, 1)
GO
INSERT INTO aeki.dbo."Order"(orderId, name, customerId) VALUES (1, N'Order 1', 1)
GO
INSERT INTO aeki.dbo.Product(id, ProductCategoryID, ProductName, Amount, Description, Price, DiscountPrice, OrderId) VALUES (1, 1, N'Chair', 2, N'Big chair', 10, 20, 1)
GO
INSERT INTO aeki.dbo.ProductCategories(id, CategoryName, ProductDetailsID) VALUES (1, N'Furniture', 1)
GO
INSERT INTO aeki.dbo.ProductDetails(id, Number, Weight, Color, FlavorTypeID) VALUES (1, 50, 100, N'Red', 1)
GO
ALTER TABLE aeki.dbo.Product
	ADD FOREIGN KEY (OrderId)
	REFERENCES dbo."Order" (orderId)
GO