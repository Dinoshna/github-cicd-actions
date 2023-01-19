FROM openjdk:11
EXPOSE 8080
ADD target/github-spring-images.jar github-spring-images.jar
ENTRYPOINT ["java","-jar","/github-spring-images.jar"]