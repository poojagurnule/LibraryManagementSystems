
<h1 align = "center"> LibraryManagementSystems </h1>
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

The Library Management System is a Java-based application designed for managing a library's book inventory. 
It provides functionalities for adding, updating, and deleting books, as well as listing all available books.

### Tech Stack :-
  * Spring Boot
  * Java
  * JPA Hibernate
  * MySQL
## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* Swagger

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

 ## Features

- Add new books with details.
- Update existing book information.
- Delete books from the library.
- List all available books.

## Getting Started

Follow the steps below to set up and run the Library Management System on your local machine.

### Prerequisites

- Java Development Kit (JDK) installed
- Apache Maven installed
- MySQL or H2 Database (configured in `application.properties`)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/library-management-system.git
## There are Two models -
 * Book
 * Author
 
  
  ## Data Flow
1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

## Usage
The Library Management System provides a simple RESTful API for managing books. You can use tools like Postman to interact with the API endpoints.

Endpoints
### Get all books:
GET (http://localhost:8080/book/all)

### Add a new book:
POST (http://localhost:8080/book/add)
* Request Body:
json

{
   
    "title": "The Power Book",
    "yearPublished": 2020,
    "author": {
      
        "name": "ram"
    }
}
### Delete a book:
DELETE (http://localhost:8080/book/delete/5)
### Swagger 
![LibraryManagementSystem](https://github.com/poojagurnule/LibraryManagementSystems/assets/102051371/8525aa82-e6b0-49fa-9700-703b9f2122c7)

## Project Summary
This is a simple Library Management System built using Spring Boot framework.The idea was to build some basic 
 CRUD operations, validation and exception handling ,using Hibernate as the ORM and MySQL as the database.
It was made using Spring Boot, Spring Data JPA, Spring Data REST and MySql Database.

  
## Author
👤 **Pooja Gurnule**
* GitHub: [Pooja Gurnule](https://github.com/poojagurnule)
  
---
  
## 🤝 Contributing
Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
  
---
  
## Show your support
Give a ⭐️ if this project helped you!
  
---
  
## 📝 License
Copyright © 2023 [Pooja Gurnule](https://github.com/poojagurnule).<br />
