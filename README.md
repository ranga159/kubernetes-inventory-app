#inventory micro service application
inventory app

#running postgres docker for inventory app
docker-compose -f inventory-db-compose.yml up

#initialize inventory tables
/inventory/src/main/resources/db/*.sql

#run inventory app
inventory runs on port 8080 and registers with eureka/discovery service

#swagger url
http://localhost:8080/swagger-ui.html

#when running inventory app just by itself, disable the service discovery and should be able to call basic end points, example curl below

/inventory-app/src/main/resources/post_book_curl.txt

/inventory-app/src/main/resources/get_books_curl.txt


#----------------------

#run eureka server
https://github.com/ranga159/eureka-server
runs on port 8761
url to access eureka http://localhost:8761

#running postgres docker for orders app, run the following command from orders app directory
git url
docker-compose -f orders-db-compose.yml up 

#initialize orders tables
/orders/src/main/resources/db/*.sql

#run orders app
https://github.com/ranga159/orders
orders app runs on port 8081

#run orders app
https://github.com/ranga159/orders
orders app runs on port 8081

#access /books end point through zuul proxy
http://localhost:8082/inventory-service/books

#access orders feign end point through zuul
http://localhost:8082/inventory-service/feignclient/orders/

