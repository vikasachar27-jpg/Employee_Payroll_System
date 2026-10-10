
# Employee Payroll Management System[span_0](start_span)[span_0](end_span)

## About the Project[span_1](start_span)[span_1](end_span)

The **Employee Payroll Management System** is a console-based Java application developed as part of our Java Programming coursework. The project demonstrates how Object-Oriented Programming (OOP) concepts can be applied to a practical problem involving employee management and salary calculation.[span_2](start_span)[span_2](end_span)

The application supports two types of employees: **Full-Time Employees** and **Part-Time Employees**. Through a menu-driven interface, users can add employee details, view all registered employees, search for an employee using their ID, generate payroll reports, and check the total number of employees created.[span_3](start_span)[span_3](end_span)

The main objective of this project is to combine Java programming concepts into one functional application while maintaining a clear and organized code structure.[span_4](start_span)[span_4](end_span)

## Architecture[span_5](start_span)[span_5](end_span)

[![Architecture](https://img.shields.io/badge/Architecture-Interactive_Diagram-blue)](https://gitdiagram.com/vikasachar27-jpg/employee_payroll_system) *(Click the badge to explore the interactive architecture diagram of the project - update link before publishing)*[span_6](start_span)[span_6](end_span)

The application is organized into three custom packages: `main`, `model`, and `service`. Each package has a specific responsibility, making the project easier to understand and maintain.[span_7](start_span)[span_7](end_span)

*   **Main package:** Contains `PayrollApp.java`, which provides the console menu, accepts user input, and connects user actions to the payroll service.[span_8](start_span)[span_8](end_span)
*   **Model package:** Contains `Person`, `Employee`, `FullTimeEmployee`, `PartTimeEmployee`, the `Department` enum, and the `Payable` interface. These classes define employee information and salary-related behavior.[span_9](start_span)[span_9](end_span)
*   **Service package:** Contains `PayrollService.java`, which manages the employee array and provides methods for adding, displaying, searching, and processing employee payrolls.[span_10](start_span)[span_10](end_span)

The abstract `Employee` class extends `Person` and implements the `Payable` interface.[span_11](start_span)[span_11](end_span) `FullTimeEmployee` and `PartTimeEmployee` extend `Employee` and implement their own salary calculation logic.[span_12](start_span)[span_12](end_span)

## Features[span_13](start_span)[span_13](end_span)

*   Add Full-Time and Part-Time Employees[span_14](start_span)[span_14](end_span)
*   Store multiple employee objects in an array[span_15](start_span)[span_15](end_span)
*   Display employee details[span_16](start_span)[span_16](end_span)
*   Search employees by Employee ID[span_17](start_span)[span_17](end_span)
*   Generate payroll reports[span_18](start_span)[span_18](end_span)
*   Display the total employee count[span_19](start_span)[span_19](end_span)
*   Select departments using an enum[span_20](start_span)[span_20](end_span)
*   Calculate net salary after tax deduction[span_21](start_span)[span_21](end_span)
*   Use formatted console output for payroll details[span_22](start_span)[span_22](end_span)
*   Navigate the application through a menu-driven interface[span_23](start_span)[span_23](end_span)

## How Payroll Works[span_24](start_span)[span_24](end_span)

### Full-Time Employee[span_25](start_span)[span_25](end_span)

The salary of a full-time employee is calculated using the basic salary and bonus. A 10% tax deduction is applied to the gross salary.[span_26](start_span)[span_26](end_span)

```text
Gross Salary = Basic Salary + Bonus
Tax = Gross Salary × 10%
Net Salary = Gross Salary - Tax
```[span_27](start_span)[span_27](end_span)

Example:[span_28](start_span)[span_28](end_span)
*   Basic Salary = ₹30,000[span_29](start_span)[span_29](end_span)
*   Bonus = ₹5,000[span_30](start_span)[span_30](end_span)
*   Gross Salary = ₹35,000[span_31](start_span)[span_31](end_span)
*   Tax = ₹3,500[span_32](start_span)[span_32](end_span)
*   Net Salary = ₹31,500[span_33](start_span)[span_33](end_span)

### Part-Time Employee[span_34](start_span)[span_34](end_span)

The salary of a part-time employee depends on the number of hours worked and the hourly rate. The same 10% tax deduction is applied to the gross salary.[span_35](start_span)[span_35](end_span)

```text
Gross Salary = Hours Worked × Hourly Rate
Tax = Gross Salary × 10%
Net Salary = Gross Salary - Tax
```[span_36](start_span)[span_36](end_span)

Example:[span_37](start_span)[span_37](end_span)
*   Hours Worked = 8[span_38](start_span)[span_38](end_span)
*   Hourly Rate = ₹100[span_39](start_span)[span_39](end_span)
*   Gross Salary = ₹800[span_40](start_span)[span_40](end_span)
*   Tax = ₹80[span_41](start_span)[span_41](end_span)
*   Net Salary = ₹720[span_42](start_span)[span_42](end_span)

## Object-Oriented Programming Concepts[span_43](start_span)[span_43](end_span)

This project demonstrates the following Java concepts:[span_44](start_span)[span_44](end_span)

*   **Encapsulation:** Private fields with public getters and setters protect employee data.[span_45](start_span)[span_45](end_span)
*   **Inheritance:** `Employee` extends `Person`, while `FullTimeEmployee` and `PartTimeEmployee` extend `Employee`.[span_46](start_span)[span_46](end_span)
*   **Abstraction:** The abstract `Employee` class defines common employee behavior and an abstract `calculateSalary()` method.[span_47](start_span)[span_47](end_span)
*   **Polymorphism:** Overridden salary calculation methods are selected at runtime according to the actual employee object.[span_48](start_span)[span_48](end_span)
*   **Interfaces:** The `Payable` interface defines the common salary calculation contract.[span_49](start_span)[span_49](end_span)
*   **Method Overloading:** The `searchEmployee()` method supports different parameter lists.[span_50](start_span)[span_50](end_span)
*   **Constructor Overloading:** `Person` provides default and parameterized constructors.[span_51](start_span)[span_51](end_span)
*   **Method Overriding:** Subclasses implement their own `calculateSalary()` method.[span_52](start_span)[span_52](end_span)
*   **`this` and `super`:** Used to refer to the current object and access parent-class constructors or methods.[span_53](start_span)[span_53](end_span)
*   **Static and Final Members:** Used for the employee counter, tax-rate constant, and final display method.[span_54](start_span)[span_54](end_span)
*   **Enum:** `Department` restricts department selection to predefined values.[span_55](start_span)[span_55](end_span)
*   **Arrays of Objects:** An `Employee` array stores Full-Time and Part-Time employee objects.[span_56](start_span)[span_56](end_span)
*   **Type Casting and String Methods:** Demonstrated during salary processing and employee ID searching.[span_57](start_span)[span_57](end_span)
*   **Control Flow and Packages:** Loops, conditional statements, jump statements, and custom packages organize the application's logic.[span_58](start_span)[span_58](end_span)

## Project Structure[span_59](start_span)[span_59](end_span)

```text
src/
├── main/
│   └── PayrollApp.java
├── model/
│   ├── Person.java
│   ├── Employee.java
│   ├── FullTimeEmployee.java
│   ├── PartTimeEmployee.java
│   ├── Department.java
│   └── Payable.java
└── service/
    └── PayrollService.java
```[span_60](start_span)[span_60](end_span)[span_61](start_span)[span_61](end_span)

## Requirements[span_62](start_span)[span_62](end_span)

*   Java JDK 17 or higher[span_63](start_span)[span_63](end_span)
*   Visual Studio Code or any Java-compatible IDE[span_64](start_span)[span_64](end_span)

## How to Run[span_65](start_span)[span_65](end_span)

Open a terminal in the project root directory.[span_66](start_span)[span_66](end_span)

**1. Compile the Java source files**[span_67](start_span)[span_67](end_span)
```bash
javac -d out src/model/*.java src/service/*.java src/main/*.java
```[span_68](start_span)[span_68](end_span)

**2. Run the application**[span_69](start_span)[span_69](end_span)
```bash
java -cp out main.PayrollApp
```[span_70](start_span)[span_70](end_span)

After launching the program, follow the menu options and enter the requested employee details.[span_71](start_span)[span_71](end_span)

## Conclusion[span_72](start_span)[span_72](end_span)

The Employee Payroll Management System demonstrates how Java OOP concepts can be combined to develop a simple and organized application. By separating employee models, payroll operations, and console interaction, the project provides a practical example of inheritance, abstraction, polymorphism, interfaces, and other Java features working together.[span_73](start_span)[span_73](end_span)
