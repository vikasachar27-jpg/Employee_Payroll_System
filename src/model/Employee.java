package model;

public abstract class Employee extends Person implements Payable {

    private String employeeId;
    private Department department;

    private static int employeeCount = 0;

    public static final double TAX_RATE = 0.10;

    public Employee(String name, int age, String employeeId, Department department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
        employeeCount++;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId
                + " | Name: " + getName()
                + " | Age: " + getAge()
                + " | Department: " + department;
    }

    // Final because every employee must use the same employee ID display method.
    public final void displayEmployeeType() {
        System.out.println("Employee ID: " + employeeId);
    }

    @Override
    public abstract double calculateSalary();
}