FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} hello-world-docker.jar
ENTRYPOINT ["java","-jar","/hello-world-docker.jar"]