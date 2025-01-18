FROM eclipse-temurin:21-jdk-alpine

LABEL authors="Calm-Jeph"

ARG jar_file=target/*.jar

COPY ${jar_file} app.jar

EXPOSE 9020

ENTRYPOINT ["java", "-jar", "/app.jar"]