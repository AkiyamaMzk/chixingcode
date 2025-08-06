package chixing.day1210.day06.homework;

public class Customer {
    private String custName;
    private double custBalance;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public double getCustBalance() {
        return custBalance;
    }

    public void setCustBalance(double custBalance) {
        this.custBalance = custBalance;
    }

    public Customer(String custName, double custBalance) {
        this.custName = custName;
        this.custBalance = custBalance;
    }
    public void printCustomerInfo(){
        System.out.print(custName+" "+custBalance);
    }
}
