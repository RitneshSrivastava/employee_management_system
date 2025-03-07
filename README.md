# Employee Management System

![Java](https://img.shields.io/badge/Java-17-blue)
![JDBC](https://img.shields.io/badge/JDBC-MySQL-orange)
![MVC](https://img.shields.io/badge/Architecture-MVC-brightgreen)
![Collections](https://img.shields.io/badge/Data%20Structures-Collections-yellow)

The **Employee Management System** is a Java-based application designed to manage employee records, departments, and related operations. It follows a **modular and clean architecture**, showcasing my proficiency in **Core Java**, **Collections**, **JDBC**, and the **MVC (Model-View-Controller)** pattern.

---

## Features

- **Add, Update, Delete, and View Employees**: Perform CRUD operations on employee records.
- **Assign Employees to Departments**: Manage employee-department relationships.
- **Manage Emergency Contacts**: Update employee emergency contact details.
- **Admin and Employee Roles**: Separate menus for admin and employee functionalities.
- **Database Integration**: Uses **JDBC** to connect to a **MySQL** database for persistent data storage.
- **Custom Exceptions**: Handles edge cases with custom exceptions like `EmployeeNotFoundException` and `EmployeeLimitReachedException`.

---

## Technologies Used

- **Core Java**: Utilized Java's object-oriented programming (OOP) principles for modular and reusable code.
- **Collections**: Implemented data structures like `ArrayList`, `HashMap`, and `Arrays` for efficient data management.
- **JDBC**: Integrated with **MySQL** for database operations, including querying, updating, and deleting records.
- **MVC Architecture**: Followed the **Model-View-Controller** pattern for clean separation of concerns:
  - **Model**: `Employee`, `Department`, and other data classes.
  - **View**: `EmployeeView` for displaying menus and user interfaces.
  - **Controller**: `EmployeeController` for handling user interactions and business logic.
- **Exception Handling**: Custom exceptions for robust error handling.
- **Modular Design**: Separated layers (repositories, services, controllers) for maintainability and scalability.

---

## Project Structure
employee_management_system/
├── src/
│ ├── controllers/ # Handles user interactions (EmployeeController)
│ ├── exceptions/ # Custom exceptions (EmployeeNotFoundException, EmployeeLimitReachedException)
│ ├── models/ # Data models (Employee, Department, Employeev2)
│ ├── repositories/ # Data access layer (JDBC, Array, and Map implementations)
│ ├── services/ # Business logic (EmployeeService, EmployeeServiceImpl)
│ ├── utils/ # Utility classes (DatabaseUtils)
│ ├── views/ # User interface (EmployeeView)
│ └── Main.java # Entry point of the application
├── .gitignore # Excludes unnecessary files from version control
└── README.md # Project documentation

---

## How to Run

1. **Prerequisites**:
   - Install **Java JDK 17** or higher.
   - Install **MySQL** and set up the `employeesdb` database.
   - Update the database credentials in `DatabaseUtils.java` if needed.

2. **Clone the Repository**:
   ```bash
   git clone https://github.com/RitneshSrivastava/employee_management_system.git
   cd employee_management_system

3. **Set up the Database**
   Run the following SQL script to create the employees table:

    CREATE DATABASE employeesdb;
    USE employeesdb;

    CREATE TABLE employees (
      id BIGINT PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(255),
      department VARCHAR(255),
      salary INT,
      dob VARCHAR(255),
      emergency_contact VARCHAR(50)
    );
4. **Run the Application**
   
   Compile and run the Main.java file:

   
**Skils Demonstrated**

    Core Java: Strong understanding of OOP, data structures, and exception handling.

    JDBC: Proficiency in database integration and SQL operations.

    MVC Architecture: Ability to design scalable and maintainable applications.

    Collections: Effective use of Java Collections for data management.

    Problem Solving: Implemented features like employee-department assignment and emergency contact updates.

    Clean Code: Followed best practices for modular, readable, and reusable code.

**Future Enhancement**

  -Add user authentication for secure access.

  -Implement unit tests using JUnit for better code reliability.

  -Integrate a logging framework (e.g., Log4j) for tracking application events.

  -Develop a web-based frontend using Spring Boot and Thymeleaf.

**Contact**
For any questions or feedback, feel free to reach out:

Name: Ritnesh Kr Srivastava

Email: ritneshntv@gmail.com

LinkedIn: https://www.linkedin.com/in/ritneshks/

GitHub: https://github.com/RitneshSrivastava

`Made with ❤️ by Ritnesh.`
   
