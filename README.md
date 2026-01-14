# Employee Management & UI Showcase System

A comprehensive Full Stack application built with **Java Spring Boot** and **Thymeleaf**. This project demonstrates core enterprise web application capabilities, including secure authentication, database CRUD operations, and a robust showcase of dynamic UI components.

## 📖 Project Overview

This application serves two main purposes:
1.  **Employee Management:** A fully functional module to manage employee records (Create, Read, Update, Delete).
2.  **UI Component Showcase:** A dedicated section demonstrating proficiency in frontend technologies (HTML/CSS/JS) integrated with a Java backend, featuring interactive elements like sliders, modals, and dynamic menus.

## 🛠️ Tech Stack

* **Backend:** Java 17, Spring Boot (Spring Web, Spring Data JPA)
* **Frontend:** Thymeleaf Template Engine, HTML5, CSS3, Vanilla JavaScript
* **Database:** H2 In-Memory Database (for rapid prototyping and testing)
* **Build Tool:** Maven

## ✨ Key Features

### 🔐 Authentication & Security
* **Session-Based Login:** Custom `AuthInterceptor` implementation to secure protected routes.
* **Access Control:** Redirects unauthenticated users to the login page.
* **Logout Functionality:** Securely invalidates user sessions.

### 👥 Employee Management (CRUD)
* **Create:** Add new employees with detailed fields (Name, Email, Mobile, DOB, Gender, Address, Country, City, Skills).
* **Read:** View a tabulated list of all employees.
* **Update:** Edit existing employee details via path-variable routing.
* **Delete:** Remove employee records with confirmation prompts.

### 🎨 UI & Feature Showcase
A dedicated module (`/more/*`) demonstrating specific UI/UX implementations:
* **Dynamic Search:** Autocomplete functionality using JavaScript.
* **Interactive Elements:** Sliders, Tooltips, and Collapse/Accordion menus.
* **Navigation:** Multi-level Sub-menus and Tabbed interfaces.
* **Popups & Modals:** Browser alerts, confirm boxes, and custom in-window modals.
* **File Handling:** Image upload functionality storing files to the local disk and database references.
* **Web Utilities:** HTTP Status code visualization and iFrame integration.

## 🚀 Getting Started

Follow these instructions to get the project up and running on your local machine.

### Prerequisites
* **Java Development Kit (JDK) 17** or higher
* **Maven** (optional, as the project includes the Maven Wrapper)

### Installation & Run

1.  **Clone the repository**
    ```bash
    git clone [https://github.com/yourusername/employee-management-system.git](https://github.com/yourusername/employee-management-system.git)
    cd employee-management-system
    ```

2.  **Build the project**
    Use the included Maven Wrapper to ensure the correct Maven version is used.
    ```bash
    # Linux/macOS
    ./mvnw clean install

    # Windows
    mvnw.cmd clean install
    ```

3.  **Run the application**
    ```bash
    # Linux/macOS
    ./mvnw spring-boot:run

    # Windows
    mvnw.cmd spring-boot:run
    ```

4.  **Access the Application**
    Open your browser and navigate to:
    `http://localhost:9090`

### 🔑 Login Credentials
The application uses a default administrator account for demonstration purposes:

* **Username:** `admin`
* **Password:** `admin123`

## 📂 Project Structure

```text
src/main
├── java/com/fayaz/project (backend)
│   ├── config/       # Web Config & Auth Interceptors
│   ├── controller/   # MVC Controllers (Handles Routes)
│   ├── entity/       # Database Models (JPA Entities)
│   ├── repository/   # Data Access Layer (Interfaces)
│   └── service/      # Business Logic & Service Implementation
└── resources (frontend)
    ├── static/       # Public Assets (CSS, JS, Images, Uploads)
    └── templates/    # Thymeleaf HTML Views
```

## 🗄️ Database Configuration
This project is configured to use an H2 In-Memory Database. The data is volatile and will be reset every time the application restarts.

```text
H2 Console: http://localhost:9090/h2-console
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (Leave Blank)
```
