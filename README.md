# AEKI
##### SWAGGER UI:
    http://localhost:8080/swagger-ui.html



#### Java programming task <br />
You are helping a small startup that wants to compete with IKEA.<br />
They need a simple system that keeps track of product assortment, customers and sold items. Since they want to compete with IKEA, they will sell furniture, textiles, and hot dogs.<br />
A few prerequisites:<br />
Everything sold at the startup has a price and a description<br />
All items in the Furniture category have an item number and a weight (apart from price and description)<br />
All items in the Textile category have an item number and a color (apart from price and description)<br />
Hot dogs have a flavor (apart from price and description), but no item number<br />
Customers can have a membership in the startup. Members get a discount on one or more item categories.<br />
Example 1: A customer buys a carpet and a chili-flavored hot dog. He is not a member, so he doesn’t get any discount.<br />
Example 2: Another customer buys a wardrobe, a rug, and a vegetarian hot dog. She is a member, with furniture and hot dog discounts. So she gets a discount on the wardrobe and the hot dog, but pays normal price for the rug. <br />
<br />
Items, categories and users can be inserted by a sql script or on application startup, no need to manage them<br />
<br />
the application should expose REST for :<br />
create order<br />
get order - response should contain products  and discounts<br />
<br />
will be nice to use spring boot, as starting point : <br />
https://spring.io/guides/gs/accessing-data-jpa/<br />
https://spring.io/guides/gs/rest-service/<br />
<br />
(jdbc:h2:mem:aeki) - [http://localhost:8080/h2-console](http://localhost:8080/h2-console) 
<br />
(POST) - [http://localhost:8080/orders](http://localhost:8080/orders)
<br />
<br />
##### Exemple 1:
```sh
{
	"name": "Order 1",
	"customerId": "1",
	"products": [
		{
			"productId": "1",
			"amount": "1"
		},
		{
			"productId": "4",
			"amount": "1"
		}
	]
}
```


Exemple 2:

```sh
{
    "name": "Order 1",
	"customerId": "2",
	"products": [
		{
			"productId": "2",
			"amount": "1"
		},
		{
			"productId": "3",
			"amount": "1"
		},
		{
			"productId": "5",
			"amount": "1"
		}
	]
}
```



