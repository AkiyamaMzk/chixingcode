package chixing.day1210.day06.inherited;

public class SavingAccout extends Account{

    public boolean deposit(double meony){
        return true;
    }

    public boolean withdraw(double meony){
        return true;
    }
    public SavingAccout(){}
    public SavingAccout(String accNO, String accName, String accPersonId, long accTelno, double accBalance) {
        super(accNO, accName, accPersonId, accTelno, accBalance);
    }
}
