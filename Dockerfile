FROM maven:latest
WORKDIR /app
COPY pom.xml /app/
COPY . /app/
RUN mvn package
CMD ["java", "-jar", "target/untitled1demo3-1.0-SNAPSHOT.jar"]