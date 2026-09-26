package model;

public class FullTimeEmployee extends Employee {

    private double basicSalary;
    private double bonus;

    public FullTimeEmployee(String name, int age, String employeeId,
                            Department department, double basicSalary, double bonus) {

        super(name, age, employeeId, department);

        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {

        double grossSalary = basicSalary + bonus;

        // Operator precedence: multiplication is performed before subtraction.
        double netSalary = grossSalary - grossSalary * TAX_RATE;

        return netSalary;
    }
}
