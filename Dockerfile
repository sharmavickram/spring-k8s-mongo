FROM openjdk:8
EXPOSE 8092
ADD target/spring-k8s-mongo-0.0.1-SNAPSHOT.jar spring-k8s-mongo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-k8s-mongo-0.0.1-SNAPSHOT.jar"]