package chixing.day1210.day06.inherited;

public class Account {
    private String accNO;
    private String accName;
    private String accPersonId;
    private long accTelno;
    private double accBalance;





    public Account() {}
    public Account(String accNO, String accName, String accPersonId, long accTelno, double accBalance) {
        this.accNO = accNO;
        this.accName = accName;
        this.accPersonId = accPersonId;
        this.accTelno = accTelno;
        this.accBalance = accBalance;
    }

    public String getAccNO() {
        return accNO;
    }

    public void setAccNO(String accNO) {
        this.accNO = accNO;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccPersonId() {
        return accPersonId;
    }

    public void setAccPersonId(String accPersonId) {
        this.accPersonId = accPersonId;
    }

    public long getAccTelno() {
        return accTelno;
    }

    public void setAccTelno(long accTelno) {
        this.accTelno = accTelno;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    private void func1(){}
}
