FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/spiral-matrix-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} spiral-matrix-service.jar
ENTRYPOINT ["java","-jar","/spiral-matrix-service.jar"]