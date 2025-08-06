package chixing.day1210.day07_inherited.homework.Question6;

public class FullTimeEmployee extends Employee {
    private double bonus;

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+bonus;
    }

    public FullTimeEmployee(int empNo, String empName, double empBaseSalary, double bonus) {
        super(empNo, empName, empBaseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
