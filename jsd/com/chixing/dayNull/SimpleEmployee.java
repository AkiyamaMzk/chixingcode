package chixing.dayNull;

import java.util.Comparator;

public class SimpleEmployee implements Comparable{
    private String empName;
    private double empSalary;
    public SimpleEmployee(String empName, double empSalary) {
        this.empName = empName;
        this.empSalary = empSalary;
    }
    public SimpleEmployee() {
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((empName == null) ? 0 : empName.hashCode());
        long temp;
        temp = Double.doubleToLongBits(empSalary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleEmployee other = (SimpleEmployee) obj;
        if (empName == null) {
            if (other.empName != null)
                return false;
        } else if (!empName.equals(other.empName))
            return false;
        if (Double.doubleToLongBits(empSalary) != Double.doubleToLongBits(other.empSalary))
            return false;
        return true;
    }
    @Override
    public int compareTo(Object o) {
        SimpleEmployee that=(SimpleEmployee) o;
        return Comparator
                .comparing(SimpleEmployee::getEmpName)
                .thenComparingDouble(SimpleEmployee::getEmpSalary)
                .compare(this,that);
    }
    @Override
    public String toString() {
        return "empName=" + empName + ", empSalary=" + empSalary;
    }
    
    
}
