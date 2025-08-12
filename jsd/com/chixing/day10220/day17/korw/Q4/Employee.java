package chixing.day10220.day17.korw.Q4;

import chixing.dayNull.SimpleEmployee;

public class Employee extends SimpleEmployee {
    private int empId;

    public Employee(int empId, String empName, double empSalary) {
        super(empName, empSalary);
        this.empId = empId;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return empId + "," + this.getEmpName()+","+this.getEmpSalary();
    }

}
