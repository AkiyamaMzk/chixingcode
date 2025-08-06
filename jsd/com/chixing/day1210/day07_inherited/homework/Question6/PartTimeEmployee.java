package chixing.day1210.day07_inherited.homework.Question6;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployee(int empNo, String empName, int hoursWorked, double hourlyRate) {
        super(empNo, empName, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
}
