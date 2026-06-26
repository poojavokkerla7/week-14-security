#  Week 14 - Enterprise Security Implementation

##  Project Overview
This project demonstrates **enterprise-level security implementation** using Spring Boot.  
It includes authentication, authorization, and JWT-based security mechanisms.

---

## Technologies Used
- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Maven

---

## Features Implemented
- User authentication (Login API)
- JWT token generation
- Secure API configuration
- Spring Security integration
- Protected endpoints setup

---

## Project Structure
week-14-security/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── gen2soft/
│       │           └── week14security/
│       │               ├── Week14SecurityApplication.java
│       │               │
│       │               ├── config/
│       │               │   └── SecurityConfig.java
│       │               │
│       │               ├── controller/
│       │               │   └── AuthController.java
│       │               │
│       │               ├── model/
│       │               │   └── AuthRequest.java
│       │               │
│       │               └── service/
│       │                   └── JwtService.java
│       │
│       └── resources/
│           └── application.properties
│
├── pom.xml
└── README.md
