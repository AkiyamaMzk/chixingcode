package chixing.day1210.day08_abstract.homework.Q10;



public class MyCheckingAccount extends BankAccount {
    public MyCheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void monthlyUpdate() {
        setBalance(getBalance()-10);
    }




}
