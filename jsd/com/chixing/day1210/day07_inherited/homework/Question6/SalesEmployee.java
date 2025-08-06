package chixing.day1210.day07_inherited.homework.Question6;

public class SalesEmployee extends Employee {
    public int salesAmount;
    public double commissionRate;

    @Override
    public double calculateSalary() {
        return super.calculateSalary()*(salesAmount*commissionRate+1);
    }

    public SalesEmployee(int empNo, String empName, double empBaseSalary, int salesAmount, double commissionRate) {
        super(empNo, empName, empBaseSalary);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
