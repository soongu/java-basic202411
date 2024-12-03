package chap1_8.practice.q2;

public class PartTimeEmployee extends Employee {

    private double hourlyWage;
    private double hoursWorked;

    public PartTimeEmployee(double hourlyWage, double hoursWorked) {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyWage * hoursWorked;
    }
}
