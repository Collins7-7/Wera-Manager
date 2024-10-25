# Wera-Manager

Wera-Manager is a project management web application designed specifically for software development teams. The platform facilitates seamless collaboration between team members by allowing users to create projects, assign tasks, update task statuses, and communicate in real-time. Built with a robust Java Spring Boot back-end, a responsive React front-end, and MySQL database, Wera-Manager empowers software development teams to streamline project workflows and maximize productivity.

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Installation](#installation)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- **User Registration and Authentication**: Users register using their email, username, and password. After registration, they are automatically logged into the platform.
- **Project Management**: Users can create, view, and delete projects. A search feature helps quickly locate specific projects.
- **Collaboration Invitations**: Project creators can send email invitations to other developers to join projects.
- **Task Management**: Create, assign, and track tasks, updating task statuses as progress is made.
- **Communication Tools**: Each project has a chatbox for real-time communication and a comment section on individual tasks to facilitate discussions and feedback.
  
---

## Tech Stack

- **Front-end**: React
- **Back-end**: Java Spring Boot
- **Database**: MySQL
- **Other**: Email integration for invitation management

---

## Installation

### Prerequisites
- Java 11 or later
- Node.js and npm
- MySQL server

### Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/Wera-Manager.git
   cd Wera-Manager
2. **Back-end Setup**

Navigate to the backend directory.
Configure your MySQL database settings in application.properties.
Build and run the Spring Boot application:
  
mvn clean install
mvn spring-boot:run

3. **Front-end Setup**

Navigate to the frontend directory.
Install dependencies and start the React development server:
npm install
npm start
Access the Application

Open a browser and go to http://localhost:3000.