# Start with a base image
FROM ubuntu:latest

# Install necessary packages
RUN apt-get update && \
    apt-get install -y wget software-properties-common && \
    add-apt-repository ppa:openjdk-r/ppa

# Install OpenJDK 21
RUN apt-get update && \
    apt-get install -y openjdk-21-jdk

# Set JAVA_HOME environment variable
ENV JAVA_HOME /usr/lib/jvm/java-21-openjdk-amd64
ENV PATH $JAVA_HOME/bin:$PATH

# Set the working directory in the container
WORKDIR /app

# Ensure the jar file is built and present at the specified path, adjust if necessary
COPY ./target/auth-service-0.0.1-SNAPSHOT.jar /app/auth-service.jar

# Expose the port your app runs on
EXPOSE 8080

# Run your app
CMD ["java", "-jar", "auth-service.jar"]
