package chixing.day1210.day08_abstract.abstract_demo;

public abstract class Account {
    private String accNo;
    private String accName;
    private String accPersonId;
    private long accTelno;
    private double accBalance; //余额





    public Account(){};

    public Account(String accNo, String accName, String accPersonId, long accTelno, double accBalance) {
        this.accNo = accNo;
        this.accName = accName;
        this.accPersonId = accPersonId;
        this.accTelno = accTelno;
        this.accBalance = accBalance;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }
}
