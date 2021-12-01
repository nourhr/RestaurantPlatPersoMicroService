FROM java:8
EXPOSE 8093
ADD /target/RestaurantPlatPersoMicroService-1.0.jar RestaurantPlatPersoMicroService.jar
ENTRYPOINT ["java","-jar","RestaurantPlatPersoMicroService.jar"]
