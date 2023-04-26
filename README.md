# Student Management System Application API
This is an Individual project, I have worked on rest API service for an Student Management System Application in around 1-2 days. This service provides users to map Courses and Address with respective Students.

## Entity Relationship Diagram

[![ER Diagram](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/ER%20diagram%20(2).png?raw=true)](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/ER%20diagram%20(2).png?raw=true)


# Functionalities
-  Students are able to register with Courses.
-  one student can have multiple Address.

## Backend Work
-  Proper Exception Handling
-  Use DTO for APIs.
-  Data Stored in the database(MySQL)

## Installation and Run
-  You can clone this repo and start the serve on localhost
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per our local database config.
```
server.port=8088
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=**YourPassword**
spring.jpa.hibernate.ddl-auto=update
```
# Tech Stacks

-   Java Core
-   Spring Data JPA
-   Spring Boot
-   Hibernate
-   MySQL

### Student
```
{
  "id": 6,
  "name": "Swapnil",
  "email": "swapnil@mail.com",
  "mobile_number":7865432109,
  "courses": [
    {
      "id": 5,
      "name": "maths"
      "fees":6700,
      "duration":"1 year"
    }
  ]
}
```
### Teacher
```
{
  "id": 7,
  "name": "Renuka",
  "email":"renuka@gmail.com",
  "yearOfExperience":3,
  "subjects": [
    {
      "id": 5,
      "name": "maths",
      "fees":6700,
      "duration":"1 year"
    }
  ]
}
```
# Backend

## Swagger UI

## Student-Controller
[![SwaggerUI](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/StudentController.png?raw=true)](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/StudentController.png?raw=true)

## Course-Controller
[![SwaggerUI](https://github.com/faterenuka/StudentManagementSystem/blob/main/swaggerImages/Course.png?raw=true)](https://github.com/faterenuka/StudentManagementSystem/blob/main/swaggerImages/Course.png?raw=true)

## Address-Controller
[![SwaggerUI](https://github.com/faterenuka/StudentManagementSystem/blob/main/swaggerImages/Address.png?raw=true)](https://github.com/faterenuka/StudentManagementSystem/blob/main/swaggerImages/Address.png?raw=true)

## Thank You!for your time :)
[![SwaggerUI](https://allfreethankyounotes.com/wp-content/uploads/2021/08/all-free-thank-you-gif-6.gif)
