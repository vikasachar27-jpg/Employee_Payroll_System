package model;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name, int age, String employeeId,
                        Department department, int hoursWorked, double hourlyRate) {
    super(name, age, employeeId, department);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate; }

    public int getHoursWorked() {
    return hoursWorked;}

    public void setHoursWorked(int hoursWorked) {
    this.hoursWorked = hoursWorked;}

    public double getHourlyRate() {
    return hourlyRate;}

    public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;}
    
    @Override
    public double calculateSalary() {
    double grossSalary = hoursWorked * hourlyRate;
    double tax = grossSalary * TAX_RATE;
    return grossSalary - tax;}
}
