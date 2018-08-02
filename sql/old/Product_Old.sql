-- Drop table

-- DROP TABLE aeki.dbo.Product

CREATE TABLE aeki.dbo.Product (
	id int NOT NULL,
	ProductCategoryID int NOT NULL,
	ProductName nvarchar(50) NOT NULL,
	Amount int NOT NULL,
	Description varchar(50) NOT NULL,
	Price int NOT NULL,
	DiscountPrice int NOT NULL,
	OrderId int,
	CONSTRAINT Product_PK PRIMARY KEY (id),
	CONSTRAINT Product_Order_FK FOREIGN KEY (OrderId) REFERENCES aeki.dbo.[Order](orderId) ON DELETE RESTRICT ON UPDATE RESTRICT
) go
