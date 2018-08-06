# AEKI

##### SWAGGER UI:
    http://localhost:8080/swagger-ui.html

#### Java <br />
(jdbc:h2:mem:aeki) - [http://localhost:8080/h2-console](http://localhost:8080/h2-console) 

(POST) - [http://localhost:8080/orders](http://localhost:8080/orders)

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


##### Exemple 2:

```sh
{
    "name": "Order 2",
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



