#inventory micro service application
inventory app

#run eureka server
https://github.com/ranga159/eureka-server
runs on port 8761

#running postgres docker for inventory app
docker-compose -f inventory-db-compose.yml up

#run inventory app
inventory runs on port 8080 and registers with eureka/discovery service

#running postgres docker for orders app, run the following command from orders app directory
git url
docker-compose -f orders-db-compose.yml up 

#run orders app
https://github.com/ranga159/orders
orders app runs on port 8081

