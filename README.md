#inventory micro service application
inventory app

#install and run minikube
https://kubernetes.io/docs/tasks/tools/install-minikube/
minikube start

#createing postgres docker for inventory app
kubectl create -f docker-persistent-volume.yml,postgres-persistent-volume-claim.yml,docker-postgres-configmap.yml
kubectl create -f docker-postgres-deployment.yml

#initialize inventory tables
docker-postgres-configmap.yml file under resources folder has the initializing scripts. The config map is mounted as volume in 
docker-postgres-deployment.yml file.

#get port numbers of services : service-port-defined-in-service
kubectl get services

#swagger url
http://{minikube-ip}:{service-port-defined-in-service}/swagger-ui.html

# to do ... update readme below

#when running inventory app just by itself, disable the service discovery and should be able to call basic end points, example curl below

/inventory-app/src/main/resources/post_book_curl.txt

/inventory-app/src/main/resources/get_books_curl.txt

#authenticate and access the secured end point
#----------------------
# run the authenticate end point
/inventory-app/src/main/resources/authentication_curl.txt
#replace the bearer token that you get from above end point in the following curl
/inventory-app/src/main/resources/authentication_books-in-stock_curl.txt

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

