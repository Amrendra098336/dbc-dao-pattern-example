# DAO Pattern with JDBC

This project demonstrates the implementation of the DAO (Data Access Object) pattern using JDBC in a Spring Boot application.

## Overview

The project consists of the following components:

- DAO implementations: `AuthorDaoImpl` and `BookDaoImpl` provide the concrete implementations of the `AuthorDao` and `BookDao` interfaces, respectively.
- Repositories: `AuthorRepository` and `BookRepository` are Spring Data JPA repositories for the `Author` and `Book` entities.
- SQL Scripts: The `V1__init_database.sql` script contains the SQL statements to create the necessary database tables and populate them with sample data.
- Test Classes: `AuthorDaoIntegrationTest` is a JUnit test class that demonstrates the usage of the DAO implementations.

## Prerequisites

To run the application, make sure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- MySQL Server

## Getting Started

1. Clone the repository:

```shell```
git clone https://github.com/your-username/dao-pattern-jdbc.git

2. Create a MySQL database named bookdb2.

3. Configure the database connection settings in the application.properties file:
   spring.datasource.url=jdbc:mysql://localhost:3306/bookdb2
   spring.datasource.username=your-username
   spring.datasource.password=your-password
4. Build and run the application using Maven:
   cd dao-pattern-jdbc
   mvn spring-boot:run
## Usage
The application demonstrates the usage of the DAO pattern for data access. You can explore the provided DAO implementations (AuthorDaoImpl and BookDaoImpl) to understand how to interact with the database using JDBC.

The test class AuthorDaoIntegrationTest showcases various DAO operations, including retrieving authors and books, creating new authors and books, updating existing entries, and deleting records.
