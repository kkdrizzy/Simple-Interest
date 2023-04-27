FROM openjdk:17
EXPOSE 8080
ADD target/SimpleInterest.jar SimpleInterest.jar
ENTRYPOINT ["java", "-jar", "/SimpleInterest.jar"]