# **Spring Boot Project with Gradle**

This project is a REST API developed with Spring Boot and Gradle. Its goal is to provide two endpoints that allow greeting users using different types of parameters in HTTP requests.

**Prerequisites**  
To run this project, you need:

- Java installed
- Gradle installed (optional)
- Create a project in Spring Initializr with Gradle as the dependency manager
- Import the project into a development environment such as IntelliJ IDEA or Eclipse

**Configuration**  
The server is configured to run on port 9001. This is specified in the application.properties file:

`server.port=9001`

**Endpoints**  
**GET /greet_1 (RequestParam)**  
Receives the "name" parameter as an optional RequestParam.  
If not provided, the default value is "Unknown".  
Example usage:  
http://localhost:9001//greet_1
http://localhost:9001//greet_1?name=RustyGearBox

**GET /greet_2 (PathVariable)**  
Receives the "name" parameter as an optional PathVariable.  
If not provided, the default value is "Unknown".  
Example usage:  
http://localhost:9001/greet_2  
http://localhost:9001/greet_2/RustyGearBox

**Basic Gradle Commands**  
This project includes the Gradle Wrapper, meaning that it's not necessary to have Gradle installed globally. You can run commands using `./gradlew` (Linux/macOS) or `gradlew.bat` (Windows), and Gradle will be downloaded automatically if it's not already present.

To run the project locally, clone it and use the following commands:

- To build the project:  
`./gradlew build`

- To clean the project:  
`./gradlew clean`

- To run the application:  
`./gradlew bootRun`

--- 

Let me know if you need further modifications!
