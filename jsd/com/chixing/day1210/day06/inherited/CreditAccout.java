package chixing.day1210.day06.inherited;

public class CreditAccout extends Account{

    private double maxOverdraft;//透支金额
    private double overdraftAmount;

    public CreditAccout(){};

    public CreditAccout(String accNO, String accName, String accPersonId, long accTelno, double accBalance, double maxOverdraft, double overdraftAmount) {
        super(accNO, accName, accPersonId, accTelno, accBalance);
        this.overdraftAmount = overdraftAmount;
        this.maxOverdraft=maxOverdraft;
    }


    public double getMaxOverdraft() {
        return maxOverdraft;
    }

    public void setMaxOverdraft(double maxOverdraft) {
        this.maxOverdraft = maxOverdraft;
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;

    }
}
