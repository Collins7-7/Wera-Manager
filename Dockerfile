FROM openjdk:17-alpine

COPY target/*.jar wera.jar

ENTRYPOINT ["java", "-jar", "/wera.jar" ]