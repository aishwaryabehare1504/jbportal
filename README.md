# 🚀 Online Job Portal API (Spring Boot | MySQL | Docker)

🔗 Live API: Coming Soon (Currently runs on localhost:8083) 
📂 GitHub Repo: https://github.com/aishwaryabehare1504/jbportal  

A backend-based Job Portal application that provides REST APIs for managing job listings and user authentication. Built using Spring Boot, this system supports job CRUD operations and secure login/register functionality using Spring Security.

---

## 📋 Project Overview

This project is a backend-based Job Portal system designed to simulate real-world job listing platforms.

💡 This project demonstrates my understanding of backend development, REST API design, database integration, and Spring Security — aligned with real-world backend engineering roles.

### It allows:
- Users to register and login securely  
- Admins/users to create, update, delete, and view jobs  
- Secure password handling using BCrypt encryption  

The application follows clean architecture using Controller, Service, and Repository layers.

---

## 🏗️ Architecture

### 🔹 Core Components

### 1. Controller Layer (API Layer)
- `JobController.java` → Job CRUD APIs  
- `AuthController.java` → Register & Login APIs  

### 2. Service Layer (Business Logic)
- `JobService.java` → Job operations logic  
- `UserService.java` → User authentication logic  

### 3. Repository Layer (Data Access)
- `JobRepository.java`  
- `UserRepository.java`  

### 4. Model Layer (Entities)
- `Job.java` → Job details  
- `User.java` → User credentials  

### 5. Security Configuration
- `SecurityConfig.java`  
- Password encryption using BCrypt  
- Basic Spring Security configuration  

### 6. Payload (DTOs)
- `LoginRequest.java`  
- `LoginResponse.java`  

---

## 🚀 Features

- User Registration & Login  
- Secure password encryption (BCrypt)  
- Create Job  
- Get All Jobs  
- Update Job  
- Delete Job  
- RESTful API design  
- MySQL database integration  
- Dockerized application  
- Environment variable configuration  

---

## 📸 API Screenshots

- 📌 Create Job → `post.png`  
- 📌 Get Jobs → `get.png`  
- 📌 Update Job → `update.png`  
- 📌 Delete Job → `delete.png`  
- 📌 Register → `register.png`  
- 📌 Login → `login.png`  

---

## 📁 Project Structure

```
com.jobportal
│
├── config
│   └── SecurityConfig.java
│
├── controller
│   ├── JobController.java
│   └── AuthController.java
│
├── model
│   ├── Job.java
│   └── User.java
│
├── repository
│   ├── JobRepository.java
│   └── UserRepository.java
│
├── service
│   ├── JobService.java
│   └── UserService.java
│
└── payload
    ├── LoginRequest.java
    └── LoginResponse.java
```

---

## ⚙️ Tech Stack

- Backend: Spring Boot  
- Language: Java  
- Database: MySQL  
- ORM: Spring Data JPA  
- Security: Spring Security + BCrypt  
- Build Tool: Maven  
- Containerization: Docker  

---

## 🔧 Configuration

### Environment Variables

```
DB_URL=your_database_url
DB_USER=your_username
DB_PASSWORD=your_password
```

---

## 🐳 Docker Setup

### Build Docker Image

```
docker build -t job-portal .
```

### Run Container

```
docker run -p 8083:8083 job-portal
```

---

## 🚀 API Endpoints

### 🔐 Authentication APIs

- POST `/auth/register`  
- POST `/auth/login`  

### 💼 Job APIs

- POST `/jobs`  
- GET `/jobs`  
- PUT `/jobs/{id}`  
- DELETE `/jobs/{id}`  

---

## 💡 Usage Example

### Register User
```json
{
  "email": "test@gmail.com",
  "password": "123456"
}
```

### Login User
```json
{
  "email": "test@gmail.com",
  "password": "123456"
}
```

### Create Job
```json
{
  "title": "Java Developer",
  "description": "Spring Boot Backend Role",
  "location": "Bangalore",
  "salary": 60000
}
```

---

## 🔒 Security Features

- Passwords are encrypted using BCrypt  
- Input validation in authentication APIs  
- Basic secure configuration using Spring Security  
- No hardcoded credentials (uses environment variables)  

---

## 🚨 Challenges Faced

- Understanding layered architecture (Controller → Service → Repository)  
- Implementing password encryption and validation  
- Configuring Spring Security properly  
- Managing environment variables for database connection  
- Debugging API errors during integration testing  

---

## 📈 Future Enhancements

- JWT Authentication (Token-based login)  
- Role-based access (Admin/User)  
- Pagination & filtering for jobs  
- Frontend integration (React)  
- Deployment on AWS / Render  
- Resume upload & job application feature  

---

## 🤝 Contributing

📌 Note: This project is built for learning and demonstration purposes.  

Currently, contributions are not open, but suggestions are welcome.

---

## 📄 License

This project is created for learning and demonstration purposes only.

---

## 🔗 Connect With Me

💼 GitHub: https://github.com/aishwaryabehare1504/jbportal  
🔗 LinkedIn: https://www.linkedin.com/in/aishwarya-behare-45191b307/

---

## ❤️ Built With

Java + Spring Boot + MySQL + Docker
