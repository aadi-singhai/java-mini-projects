Enterprise HR Directory System

A simple Java-based Employee Directory Management System that
demonstrates Object-Oriented Programming principles and efficient data
handling using HashMap.

This project simulates a basic HR system capable of storing, retrieving,
deleting, and displaying employee records.

------------------------------------------------------------------------

FEATURES

-   Add new employees
-   Prevent duplicate employee IDs
-   Retrieve employee details using ID
-   Remove employees from the directory
-   Display all employees using modern Java Lambda syntax
-   Uses HashMap for fast O(1) lookups

------------------------------------------------------------------------

PROJECT STRUCTURE

EnterpriseApp.java
│
├── Employee Class
│   ├── Fields: empId, name, department, email
│   ├── Getters
│   └── Overridden toString()
│
├── DirectoryManager Class
│   ├── addEmployee()
│   ├── getEmployee()
│   ├── removeEmployee()
│   └── printAllEmployee()
│
└── EnterpriseApp (Main Class)
    └── Demonstrates system functionality

------------------------------------------------------------------------

CONCEPTS DEMONSTRATED

-   Encapsulation (private fields with public getters)
-   Constructor initialization
-   HashMap data structure
-   CRUD operations
-   Lambda expressions (forEach)
-   Method overriding (toString())

------------------------------------------------------------------------

HOW IT WORKS

1.  Boot System The application initializes the HR directory system.

2.  Add Employees Employees are added to the internal HashMap database.
    Duplicate IDs are prevented using database.containsKey(employeeId)

3.  Retrieve Employee Employees are fetched in O(1) time using
    database.get(id) Returns Employee object if found, null if not
    found.

4.  Remove Employee Validates existence before deletion to prevent
    silent failures.

5.  Print All Employees Uses Java Lambda expression:
    database.forEach((id, emp) -> System.out.println(emp));

------------------------------------------------------------------------

SAMPLE OUTPUT

— Booting Enterprise HR System — [SUCCESS] Added Alice Successfully to
the Database. [SUCCESS] Added Bob Successfully to the Database.
[SUCCESS] Added Charlie Successfully to the Database.

—–Testing duplicate insertion—– [ERROR] Employee ID EMP-001 already
exists. Cannot overwrite.

—–Testing Deletion—– [SUCCESS] Employee EMP-003 removed.

—–Getting Employee—– ID: EMP-002 | Name: Bob | Dept: Engineering |
Email: bob@company.com

—–Final Directory Status—– ID: EMP-001 | Name: Alice | Dept: HR | Email:
alice@company.com ID: EMP-002 | Name: Bob | Dept: Engineering | Email:
bob@company.com

------------------------------------------------------------------------

REQUIREMENTS

-   Java 8 or higher
-   Any IDE (IntelliJ, Eclipse, VS Code) or command-line compiler

------------------------------------------------------------------------

HOW TO RUN

Compile: javac EnterpriseApp.java

Run: java EnterpriseApp

------------------------------------------------------------------------

TIME COMPLEXITY

Add Employee - O(1) Get Employee - O(1) Remove Employee - O(1) Print
All - O(n)

------------------------------------------------------------------------

DESIGN STRENGTHS

-   Encapsulated database (cannot be accessed directly)
-   Prevents duplicate IDs
-   Clean separation of concerns
-   Efficient data retrieval

------------------------------------------------------------------------

POSSIBLE IMPROVEMENTS

-   Add updateEmployee() method
-   Add input validation
-   Implement file/database persistence
-   Convert to layered architecture
-   Add exception handling instead of console printing

------------------------------------------------------------------------

LEARNING PURPOSE

Ideal for Java beginners practicing OOP, students learning HashMap, and
building mini portfolio projects.
