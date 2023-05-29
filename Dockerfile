FROM openjdk:17-oracle
COPY target/rekognition-0.0.1-SNAPSHOT.jar rekognition-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "rekognition-0.0.1-SNAPSHOT.jar"]