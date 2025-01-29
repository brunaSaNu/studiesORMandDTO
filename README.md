# Basic Layered API with Spring Boot and JPA

This is a basic API developed to study layered architecture using Java, Spring Boot, and JPA. It follows DTO and ORM layers and includes a read-only endpoint to return a user from the database. The project leverages Spring features for improved performance and uses the H2 in-memory database for testing.

## Technologies Used
- **Java**
- **Spring Boot**
- **JPA (Java Persistence API)**
- **H2 Database** (in-memory database for testing)

## Project Structure
The project is organized into layers:
1. **DTO (Data Transfer Object)**: Handles data transfer between layers.
2. **ORM (Object-Relational Mapping)**: Maps Java objects to database tables.

## Endpoint
- **GET /users/{id}**: Returns user data based on the provided ID (read-only operation).

## H2 Database
The H2 database is configured to run in memory. To access the H2 console during application execution:
1. Go to:

http://localhost:8080/h2-console

2. Use the following credentials:
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: (leave blank)

## Testing
All endpoints have been tested using the H2 database and Postman. The layered architecture ensures clean separation of concerns, and Spring optimizations enhance performance.
