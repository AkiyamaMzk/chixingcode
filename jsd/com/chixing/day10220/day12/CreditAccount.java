package chixing.day10220.day12;

import chixing.day10220.day12.exception.BalanceNotEnoughException;

public class CreditAccount extends Account {

    private double overdraftAmount; // 已透支金额
    private double maxOverdraft;// 最大透支额度

    public CreditAccount() {
    }

    public CreditAccount(String accNo, String accName, String accPersonId, long accTelno, double accBalance) {
        super(accNo, accName, accPersonId, accTelno, accBalance);
    }

    @Override
    public double deposit(double money) {
        this.setAccBalance( this.getAccBalance() + money);
        return this.getAccBalance();
    }

    // 取款
    @Override
    public double withdraw(double money) throws BalanceNotEnoughException {
        if(money > this.getAccBalance())
            throw new BalanceNotEnoughException("账户余额已不足"); // 抛出一个异常
        this.setAccBalance(this.getAccBalance()  - money);
        return this.getAccBalance() ;
    }

    public double transfer(double money,Account anotherAcc) throws BalanceNotEnoughException {
        if(money > this.getAccBalance())
            throw new BalanceNotEnoughException("账户余额已不足"); // 抛出一个异常
        this.setAccBalance(this.getAccBalance()  - money);
        anotherAcc.setAccBalance(anotherAcc.getAccBalance()+money);
        return this.getAccBalance() ;
    }


    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public double getMaxOverdraft() {
        return maxOverdraft;
    }

    public void setMaxOverdraft(double maxOverdraft) {
        this.maxOverdraft = maxOverdraft;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "overdraftAmount=" + overdraftAmount +
                ", maxOverdraft=" + maxOverdraft +
                '}';
    }
}
