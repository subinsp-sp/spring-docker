# Use an official OpenJDK runtime as a base image
FROM openjdk:17

# Set the port that the container will expose
EXPOSE 8080

# Copy the jar file to the container
COPY target/spring-docker.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
