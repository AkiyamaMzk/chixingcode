package chixing.day1210.day06.homework;

public class CustomerTest {
    public static void main(String[] args) {
        LoanCustomer[] loanCustomer=new LoanCustomer[10];
        for(int i=0;i<10;i++){
            loanCustomer[i]=new LoanCustomer("cust"+i,i*40,i*i*10);
            loanCustomer[i].printCustomerInfo();
            System.out.println(" "+loanCustomer[i].getLoanAmount()+" "+loanCustomer[i].isEligibleForMoreLoan());
        }
    }
}
