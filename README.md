# todo

This repository contains a Todo API implemented using Spring Boot. The API provides endpoints for basic CRUD operations on Todo items, along with Swagger documentation for easy exploration.

Table of Contents
Technologies Used
Prerequisites
Getting Started
Installation
Running the Application
API Endpoints
Swagger Documentation
Testing

Technologies Used
Java 11
Spring Boot 3.2.8
Spring Data JPA
MySQL (or your preferred database)
Swagger/OpenAPI
Prerequisites
Before running the application, ensure you have the following installed/setup:

Java Development Kit (JDK) 11 or higher
Maven or Gradle build tool (used for dependency management and building)
Getting Started
Installation
Clone the repository to your local machine:

bash
Copy code
git clone <repository-url>
cd todo-api
Ensure you have MySQL installed and running. Update application.properties with your database configuration:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=root_password
Running the Application
Build the application using Maven:

API Endpoints
The following endpoints are available:

GET /api/todos: Retrieve all todos.
POST /api/todos: Create a new todo.
GET /api/todos/{todoId}: Retrieve a todo by ID.
PUT /api/todos/{todoId}: Update a todo by ID.
PATCH /api/todos/{todoId}: Mark a todo as complete by ID.
DELETE /api/todos/{todoId}: Delete a todo by ID.
GET /api/todos/count: Get the total count of todos.
Swagger Documentation
Swagger UI is integrated into the application for easy API exploration and documentation. Access Swagger UI at:

Local: http://localhost:8080/swagger-ui.html
Swagger/OpenAPI JSON endpoint:

Local: http://localhost:8080/v3/api-docs
Testing
Use tools like Postman or curl to test the endpoints. Ensure all endpoints are returning expected results and handling errors appropriately.





