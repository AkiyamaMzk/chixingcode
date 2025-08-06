package chixing.day1210.day06.homework;

public class LoanCustomer extends Customer{
    private double loanAmount;

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LoanCustomer(String custName, double custBalance, double loanAmount) {
        super(custName, custBalance);
        this.loanAmount = loanAmount;
    }
    public boolean isEligibleForMoreLoan(){
        return this.loanAmount<this.getCustBalance()*2;
    }
}

