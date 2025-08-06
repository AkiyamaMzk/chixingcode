package chixing.day1210.day08_abstract.homework.Q10;

public class MySavingsAccount extends BankAccount{


    public MySavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);

    }

    @Override
    public void monthlyUpdate(){
        setBalance(getBalance()*1.02);
    }
}
