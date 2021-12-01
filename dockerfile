FROM java:8
EXPOSE 8093
ADD /target/RestaurantPlatPersoMicroService-1.0.jar.original RestaurantPlatPersoMicroService-1.0.jar
ENTRYPOINT ["java","-jar","RestaurantPlatPersoMicroService-1.0.jar"]
