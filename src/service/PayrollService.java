package service;

import model.Employee;
import model.Payable;

public class PayrollService {

    private Employee[] employees;
    private int employeeCount;

    public PayrollService(int size) {
        employees = new Employee[size];
        employeeCount = 0;
    }

    public void addEmployee(Employee employee) {

        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;

            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee storage is full.");
        }
    }

    public void displayEmployees() {

        if (employeeCount == 0) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n========== EMPLOYEE LIST ==========");

        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i]);
        }
    }

    // Method overloading - normal employee ID search
    public Employee searchEmployee(String employeeId) {
        return searchEmployee(employeeId, true);
    }

    // Method overloading - search with case sensitivity option
    public Employee searchEmployee(String employeeId, boolean ignoreCase) {

        for (int i = 0; i < employeeCount; i++) {

            String storedId = employees[i].getEmployeeId().trim();
            String searchId = employeeId.trim();

            if (ignoreCase) {

                if (storedId.equalsIgnoreCase(searchId)) {
                    return employees[i];
                }

            } else {

                if (storedId.equals(searchId)) {
                    return employees[i];
                }
            }
        }

        return null;
    }

    public void generatePayroll() {

        if (employeeCount == 0) {
            System.out.println("No employees available.");
            return;
        }

        System.out.println("\n========== PAYROLL REPORT ==========");

        for (int i = 0; i < employeeCount; i++) {

            Employee employee = employees[i];

            // Interface reference
            Payable payable = employee;

            // Dynamic binding through the interface reference
            double netSalary = payable.calculateSalary();

            // Type casting: double to int
            int wholeRupees = (int) netSalary;

            System.out.printf(
                    "ID: %s | Name: %s | Department: %s | Net Salary: %.2f | Whole Rupees: %d%n",
                    employee.getEmployeeId(),
                    employee.getName(),
                    employee.getDepartment(),
                    netSalary,
                    wholeRupees
            );
        }
    }
}