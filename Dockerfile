FROM openjdk:11-ea-11-jdk-slim
WORKDIR /app/test
EXPOSE 8000
COPY target/cicd-0.0.1.jar test.jar
ENTRYPOINT ["java", "-jar", "test.jar"]