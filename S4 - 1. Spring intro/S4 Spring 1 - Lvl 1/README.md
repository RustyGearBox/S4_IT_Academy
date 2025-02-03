# Spring Boot Project with Maven

This project is a REST API developed with Spring Boot and Maven. Its goal is to provide two endpoints that allow greeting users through different types of parameters in HTTP requests.

## Prerequisites

To run this project, you need to:

- Have [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed
- Have [Maven](https://maven.apache.org/install.html) installed
- Create a project in [Spring Initializr](https://start.spring.io/)
- Import the project into a development environment like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/downloads/)

## Configuration

The server is configured to run on port 9000. This is specified in the `application.properties` file:

```properties
server.port=9000
```

## Endpoints

### GET `/greet1` (RequestParam)

- Receives the `name` parameter as an optional RequestParam.
- If not provided, the default value is "UNKNOWN".
- Usage example:
    - `http://localhost:9000/greet1`
    - `http://localhost:9000/greet1?name=myName`

### GET `/greet2` (PathVariable)

- Receives the `name` parameter as an optional PathVariable.
- If not provided, the default value is "UNKNOWN".
- Usage example:
    - `http://localhost:9000/greet2`
    - `http://localhost:9000/greet2/myName`

## Basic Maven Commands

To run the project in your local environment, clone it and use the following commands:

- **Compile the project:**
  ```sh
  mvn compile
  ```
- **Package the project:**
  ```sh
  mvn package
  ```
- **Clean the project:**
  ```sh
  mvn clean
  ```
- **Run the application:**
  ```sh
  mvn spring-boot:run
  ```
