package main;

import java.util.Scanner;

import model.Department;
import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;
import service.PayrollService;

public class PayrollApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PayrollService service = new PayrollService(50);

        while (true) {

            System.out.println("\n========================================");
            System.out.println("       EMPLOYEE PAYROLL SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Search Employee");
            System.out.println("5. Generate Payroll");
            System.out.println("6. Display Employee Count");
            System.out.println("7. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Add Full-Time Employee ---");

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter employee ID: ");
                    String employeeId = sc.nextLine();

                    System.out.print("Enter department (HR/IT/FINANCE/SALES): ");
                    Department department =
                            Department.valueOf(sc.nextLine().trim().toUpperCase());

                    System.out.print("Enter basic salary: ");
                    double basicSalary = sc.nextDouble();

                    System.out.print("Enter bonus: ");
                    double bonus = sc.nextDouble();
                    sc.nextLine();

                    Employee fullTimeEmployee =
                            new FullTimeEmployee(
                                    name, age, employeeId,
                                    department, basicSalary, bonus);

                    service.addEmployee(fullTimeEmployee);

                    break;

                case 2:
                    System.out.println("\n--- Add Part-Time Employee ---");

                    System.out.print("Enter name: ");
                    name = sc.nextLine();

                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter employee ID: ");
                    employeeId = sc.nextLine();

                    System.out.print("Enter department (HR/IT/FINANCE/SALES): ");
                    department =
                            Department.valueOf(sc.nextLine().trim().toUpperCase());

                    System.out.print("Enter hours worked: ");
                    int hoursWorked = sc.nextInt();

                    System.out.print("Enter hourly rate: ");
                    double hourlyRate = sc.nextDouble();
                    sc.nextLine();

                    Employee partTimeEmployee =
                            new PartTimeEmployee(
                                    name, age, employeeId,
                                    department, hoursWorked, hourlyRate);

                    service.addEmployee(partTimeEmployee);

                    break;

                case 3:
                    service.displayEmployees();
                    break;

                case 4:
                    System.out.print("Enter Employee ID to search: ");
                    String searchId = sc.nextLine();

                    Employee foundEmployee =
                            service.searchEmployee(searchId);

                    if (foundEmployee != null) {
                        System.out.println("\nEmployee Found!");
                        System.out.println(foundEmployee);
                    } else {
                        System.out.println("\nEmployee not found.");
                    }

                    break;

                case 5:
                    service.generatePayroll();
                    break;

                case 6:
                    System.out.println(
                            "Total employees created: "
                            + Employee.getEmployeeCount());

                    break;

                case 7:
                    System.out.println(
                            "Thank you for using Employee Payroll System!");

                    sc.close();
                    return;

                default:
                    System.out.println(
                            "Invalid choice. Please try again.");

                    continue;
            }
        }
    }
}