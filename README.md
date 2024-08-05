# Employee Management System

## Introduction

The Employee Management System is a Spring Boot application that allows users to manage employees. It includes functionalities to create, read, update, and delete employees. The project also integrates Swagger (OpenAPI) for interactive API documentation.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Setup](#project-setup)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)
- [Endpoints](#endpoints)

## Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher
- Git (optional)

## Project Setup

1. **Clone the Repository** (if applicable):

    ```sh
    git clone https://github.com/your-repo/employee-management-system.git
    cd employee-management-system
    ```

2. **Import the Project into Your IDE**:

    - Open your IDE (e.g., IntelliJ IDEA, Eclipse).
    - Import the project as a Maven project.

3. **Build the Project**:

    ```sh
    mvn clean install
    ```

## Configuration

1. **Application Properties**:

    Open `src/main/resources/application.properties` and configure the database settings as per your environment:

    ```properties
    # Database Configuration
    spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update

    # Server Configuration
    server.port=8080
    ```

    Ensure you have a MySQL database running with the name `yourdatabase` and update the username and password accordingly.

## Running the Application

1. **Run the Application**:

    You can run the application using your IDE or via the command line:

    ```sh
    mvn spring-boot:run
    ```

    The application will start on the port configured in `application.properties` (default is 8080).

2. **Access the Application**:

    Open your web browser and navigate to `http://localhost:8080`.

## API Documentation

This project uses Swagger (OpenAPI) for API documentation.

1. **Access Swagger UI**:

    After starting the application, you can access the Swagger UI at:

    ```sh
    http://localhost:8080/swagger-ui.html
    ```

    This provides an interactive interface to test the API endpoints.
