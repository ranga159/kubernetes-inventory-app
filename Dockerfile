FROM java:8
ADD target/inventory-0.0.1-SNAPSHOT.jar inventory-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","inventory-0.0.1-SNAPSHOT.jar"]
