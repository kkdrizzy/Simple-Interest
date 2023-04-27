FROM openjdk:17
EXPOSE 8080
ADD target/simpleinterest.jar simpleinterest.jar
ENTRYPOINT ["java", "-jar", "/simpleinterest.jar"]