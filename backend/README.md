# Project Structure
📂 Project Structure & Definitions
1. sky-common
Contains shared classes and utility modules used across the entire project.

2. sky-pojo
This module centralizes all data models to ensure consistency across layers.

Entity: Persistent objects that typically map directly to database tables.

DTO (Data Transfer Object): Objects used to pass data between different layers of the application (e.g., from Service to Controller).

VO (View Object): Data objects specifically tailored for frontend display requirements.

POJO (Plain Old Java Object): Basic Java objects containing only private attributes with their corresponding getters and setters.

3. sky-server
The core business logic engine, containing:

Configurations: Property files (.yml / .properties) and Configuration classes.

Interceptors: Logic for handling cross-cutting concerns like authentication.

MVC Layers:

Controller: API Endpoints.

Service: Business Logic.

Mapper: Data Access Layer (MyBatis).

Bootstrap: The main Application class to start the server.