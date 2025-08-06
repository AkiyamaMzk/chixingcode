package chixing.day10220.day12;

import chixing.day10220.day12.exception.BalanceNotEnoughException;

public abstract class Account   {
    private String accNo;
    private String accName;
    private String accPersonId;
    private long accTelno;
    private double accBalance; //余额


    public Account(){}
    // 只有 有参构造函数，默认的无参构造函数  无效了，被覆盖了
    public Account(String accNo, String accName, String accPersonId, long accTelno, double accBalance) {
        this.accNo = accNo;
        this.accName = accName;
        this.accPersonId = accPersonId;
        this.accTelno = accTelno;
        this.accBalance = accBalance;
    }


    //存款
    public abstract double deposit(double money);
    //取款
    public abstract double withdraw(double money) throws BalanceNotEnoughException;


    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return this.accName;
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

    @Override
    public String toString() {
        return "Account{" +
                "accNo='" + accNo + '\'' +
                ", accName='" + accName + '\'' +
                ", accPersonId='" + accPersonId + '\'' +
                ", accTelno=" + accTelno +
                ", accBalance=" + accBalance +
                '}';
    }
}
