-- Drop table

-- DROP TABLE aeki.dbo.[Order]

CREATE TABLE aeki.dbo.[Order] (
	orderId int NOT NULL IDENTITY(1,1),
	name varchar(50),
	customerId int,
	CONSTRAINT PK__Order__3213E83FDEF08E12 PRIMARY KEY (orderId)
) go
