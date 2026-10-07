 🛒 Pandit General Store

A full-stack grocery store web application built with Java and Spring Boot.

The application provides a simple online shopping experience for a local grocery store, including product browsing, category-based filtering, authentication, and cart management.

## Features

- Grocery product catalog
- Product categories
- Category-based product filtering
- Product details
- Shopping cart
- User authentication
- Google OAuth2 login
- User-specific cart management
- Responsive UI
- Thymeleaf-based server-side rendering
- Database persistence using JPA/Hibernate
- Secure authentication using Spring Security

## Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Spring Security
- OAuth2 / Google Login
- Maven

### Frontend
- Thymeleaf
- HTML5
- CSS3
- JavaScript
- Tailwind CSS
- Font Awesome

### Database
- MySQL

 ### Main Components

**Controller**

* Handles HTTP requests
* Receives request parameters
* Passes data between the view and service layer

**Service**

* Contains application/business logic
* Communicates with repositories

**Repository**

* Handles database operations using Spring Data JPA

**Entity**

* Represents database tables and relationships

**Thymeleaf**

* Renders dynamic data on the frontend

  
 

 
## Authentication

Authentication is implemented using Spring Security.

The application supports:

* User login
* User registration
* Google OAuth2 login
* Password hashing
* Protected user-specific functionality

The authenticated user is used to identify resources that belong to that user, such as the shopping cart.

## Shopping Cart

The cart is associated with the logged-in user so that different users maintain separate carts.

 

This prevents one user's cart data from being shared with another user.

## Project Structure

```text
src/
└── main/
    ├── java/
    │   └── ...
    │       ├── controller/
    │       ├── service/
    │       ├── repository/
    │       ├── entity/
    │       └── config/
    │
    └── resources/
        ├── templates/
        │   ├── fragments/
        │   └── ...
        │
        ├── static/
        │   ├── css/
        │   ├── js/
        │   └── images/
        │
        └── application.properties
```
 
## Key Learning Areas

This project helped implement and understand:

* Spring Boot application development
* MVC architecture
* Spring Data JPA
* Hibernate entity relationships
* Repository and service layers
* Thymeleaf templates and fragments
* Spring Security
* OAuth2 / Google authentication
* User-specific data handling
* MySQL database integration
* JavaScript-based frontend interactions

## Author

**Anshul Yadav**

Java Backend Developer

Focused on Java, Spring Boot, Hibernate, MySQL and backend development.

```
 

And importantly, **everything here connects to the actual project we've discussed.**
```
