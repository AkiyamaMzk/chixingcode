package chixing.day1210.day07_inherited.homework.Question6;

public class Employee {
    private int empNo;
    private String empName;
    private double empBaseSalary;

    public double calculateSalary(){
        return empBaseSalary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpBaseSalary() {
        return empBaseSalary;
    }

    public void setEmpBaseSalary(double empBaseSalary) {
        this.empBaseSalary = empBaseSalary;
    }

    public Employee(int empNo, String empName, double empBaseSalary) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBaseSalary = empBaseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", Salary=" + String.format("%.2f", calculateSalary() )+
                '}';
    }
}
