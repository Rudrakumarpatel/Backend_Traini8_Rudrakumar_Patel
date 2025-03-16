# Traini8 - Training Center Registry

## Project Overview
This project is an MVP (Minimum Viable Product) for a **registry of Govt-funded Training Centers**. It provides **REST APIs** to store and retrieve training center information using **Spring Boot** and **MySQL**.

## Features
- **Create Training Center API** (POST `/api/training-centers`)
- **Get All Training Centers API** (GET `/api/training-centers`)
- **Validation of fields using annotations**
- **Exception Handling for validation errors**
- **Data stored in MySQL using Spring Data JPA**

## Tech Stack
- **Spring Boot** (Java)
- **Spring Data JPA**
- **MySQL**
- **Maven**
- **Lombok**

## API Endpoints

### 1. Create Training Center (POST `/api/training-centers`)
#### Request Body (JSON)
```json
{
  "centerName": "ABC Training Center",
  "centerCode": "ABC123456789",
  "address": {
    "detailedAddress": "123 Main Street",
    "city": "Ahmedabad",
    "state": "Gujarat",
    "pincode": "380001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Python"],
  "contactEmail": "abc@example.com",
  "contactPhone": "9876543210"
}
```
#### Response (Success - 201 Created)
```json
{
  "id": 1,
  "centerName": "ABC Training Center",
  "centerCode": "ABC123456789",
  "address": {
    "detailedAddress": "123 Main Street",
    "city": "Ahmedabad",
    "state": "Gujarat",
    "pincode": "380001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Python"],
  "createdOn": 1710850189,
  "contactEmail": "abc@example.com",
  "contactPhone": "9876543210"
}
```
#### Validation Errors (Example Response - 400 Bad Request)
```json
{
  "message": "CenterCode must be exactly 12 characters."
}
```

### 2. Get All Training Centers (GET `/api/training-centers`)
#### Response (Success - 200 OK)
```json
[
  {
    "id": 1,
    "centerName": "ABC Training Center",
    "centerCode": "ABC123456789",
    "address": {
      "detailedAddress": "123 Main Street",
      "city": "Ahmedabad",
      "state": "Gujarat",
      "pincode": "380001"
    },
    "studentCapacity": 100,
    "coursesOffered": ["Java", "Python"],
    "createdOn": 1710850189,
    "contactEmail": "abc@example.com",
    "contactPhone": "9876543210"
  }
]
```
## Database Configuration (MySQL)
Update **`application.properties`** in `src/main/resources/`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/traini8_db
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

## Project Setup
### Prerequisites
- **Java 17+**
- **Maven**
- **MySQL**

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/Backend_Traini8_YourName.git
   cd Backend_Traini8_YourName
   ```
2. Configure MySQL database in `application.properties`
3. Build the project:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```
5. Test APIs using **Postman** or **cURL**.

## How to Test the APIs
1. **POST /api/training-centers** - Create a new training center
2. **GET /api/training-centers** - Retrieve all stored training centers

## Deployment
- **Run as a standalone JAR**:
  ```sh
  java -jar target/traini8-0.0.1-SNAPSHOT.jar
  ```
## Folder Structure
```
traini8/
│── src/
│   ├── main/java/com/traini8/
│   │   ├── controller/
│   │   │   ├── TrainingCenterController.java
│   │   ├── model/
│   │   │   ├── TrainingCenter.java
│   │   │   ├── Address.java
│   │   ├── repository/
│   │   │   ├── TrainingCenterRepository.java
│   │   ├── service/
│   │   │   ├── TrainingCenterService.java
│   │   ├── exception/
│   │   │   ├── GlobalExceptionHandler.java
│   │   ├── Traini8Application.java
│── src/main/resources/
│   ├── application.properties
│── pom.xml
│── README.md
```

## Author
- **Rudrakumar Patel**
- **Email: rudrapatel2992003@gmail.com**

