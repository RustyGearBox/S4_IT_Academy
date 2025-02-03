# Spring Boot Project with Gradle

This project is a REST API developed with Spring Boot and Gradle. Its goal is to provide two endpoints that allow greeting users with different types of parameters in the HTTP requests.

## Prerequisites

To run this project, you need to:

- Have [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed
- Have [Gradle](https://gradle.org/install/) installed (optional)
- Create a project in [Spring Initializr](https://start.spring.io/) with Gradle as the dependency manager
- Import the project into a development environment like [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/downloads/)

## Configuration

The server is configured to run on port 9001. This is specified in the `application.properties` file:

```properties
server.port=9001
```

## Endpoints

### GET `/greet1` (RequestParam)

- Receives the `name` parameter as an optional RequestParam.
- If not provided, the default value is "UNKNOWN".
- Example usage:
  - `http://localhost:9001/greet_1`
  - `http://localhost:9001/greet_1?name=RustyGearBox`

### GET `/greet2` (PathVariable)

- Receives the `name` parameter as an optional PathVariable.
- If not provided, the default value is "UNKNOWN".
- Example usage:
  - `http://localhost:9001/greet2`
  - `http://localhost:9001/greet2/RustyGearBox`

## Basic Gradle Commands

This project includes the **Gradle Wrapper**, which means you don't need to have Gradle installed globally. You can run the commands using `./gradlew` (Linux/macOS) or `gradlew.bat` (Windows), and Gradle will automatically be downloaded if it's not already present.

To run the project locally, clone it and use the following commands:

- **Build the project:**
  ```sh
  ./gradlew build
  ```
- **Clean the project:**
  ```sh
  ./gradlew clean
  ```
- **Run the application:**
  ```sh
  ./gradlew bootRun
  ```
