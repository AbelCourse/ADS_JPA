FROM openjdk:17
RUN mkdir /app
COPY target/citylibraryapp-0.0.1-SNAPSHOT.jar /app
WORKDIR /app
CMD ["java", "-jar", "./citylibraryapp-0.0.1-SNAPSHOT.jar"]