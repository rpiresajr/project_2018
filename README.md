[![Build Status](https://travis-ci.org/rpiresajr/project_2018.svg?branch=master)](https://travis-ci.org/rpiresajr/project_2018)


# Hackthon 2018 - Vanhack
 Project for Hackthon of Vanhack 2018.
 
 Using:
     
     Spring Boot (Version 1.5.10)
     
     Java 8
     
     JPA ( To use any database )
     
     Swagger2
     
     Travis CI
 
 
 
 Build an API to:
 
● Allow Authentication; 

● Query Products;

● Receive Orders;

● Cancel an Order;

● Get Order Status;

● Store data in a database of his/her choice;



# How to work


## 1 getting token 

  - Headers
    ( Content-Type: application/json )

  - For USER
      ( Body
      {
        "email": "usuario@email.com",
        "senha": "123456"
      } )
  
  - For ADMIN
      ( Body 
      {
        "email": "admin@email.com",
        "senha": "123456"
      } )

  - URL: http://localhost8090/auth

  - Method: POST


## 2 getting a refresh token
  - Headers (
      Content-Type: application/json, 
      Authorization: Bearer TOKEN )

  - URL: http://localhost:8090/auth/refresh

  - Method: POST
  
  ## 3 getting information ( add to header: Content-Type: application/json  [and] Authorization: Bearer TOKEN )
  
   - Get Products (GET)
   
   - URL : http://localhost:8090/v1/products
   
   
   - Get Orders (GET)
   
   - URL : http://localhost:8090/v1/orders
   
   
   - Get 1 order (GET)
   
   - URL : http://localhost:8090/v1/order/PUT_ORDER_NUMBER_HERE
   
   
   - Get Status (GET)
   
   - URL : http://localhost:8090/v1/order/status/PUT_ORDER_NUMBER_HERE
 
   
   - Creating a Order (POST)
   
   - URL : http://localhost:8090/v1/order 
   
   {
    "clientName": "Renato Pires",
    "status": "Submitted",
    "listProducts": "Normal Pizza",
    "dateOrder": 1521399623285
   }
   
   
   - Cancel the Order (DELETE)
   
   - URL : http://localhost:8090/v1/order/PUT_ORDER_NUMBER_HERE
   
