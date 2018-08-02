INSERT INTO aeki.dbo.Customer(Name) VALUES (N'Sebi');

INSERT INTO aeki.dbo.Customer(Name) VALUES (N'Claudiu');

INSERT INTO aeki.dbo.Customer(Name) VALUES (N'Razvan');

INSERT INTO aeki.dbo.Membership(ProductCategoryID, customerId) VALUES (1, 1);

INSERT INTO aeki.dbo.Product(ProductCategoryID, ProductName, Description, Price) VALUES (1, N'Chair', N'Big chair', 10);

INSERT INTO aeki.dbo.Product(ProductCategoryID, ProductName, Description, Price) VALUES (2, N'Hot Dog', N'Small Hot Dog with Ketckup', 5);



INSERT INTO aeki.dbo.ProductCategories(CategoryName, ProductDetailsID, discountPercent) VALUES (N'Furniture', 1, 10);

INSERT INTO aeki.dbo.ProductCategories(CategoryName, ProductDetailsID, discountPercent) VALUES (N'Textile', 2, 20);

INSERT INTO aeki.dbo.ProductCategories(CategoryName, ProductDetailsID, discountPercent) VALUES (N'Hot Dogs', 3, 30);



INSERT INTO aeki.dbo.ProductDetails(Number, Weight, Color, flavorType) VALUES (N'1', N'5', null, N'CHILI');

INSERT INTO aeki.dbo.ProductDetails(Number, Weight, Color, flavorType) VALUES (N'2', null, N'Red', null);