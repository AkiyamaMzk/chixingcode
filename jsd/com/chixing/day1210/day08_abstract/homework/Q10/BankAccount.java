package chixing.day1210.day08_abstract.homework.Q10;

public abstract class BankAccount {
    private int accountNumber;
    private double balance;
    private static int accNums=0;
    {
        accNums++;
    }
    public abstract void monthlyUpdate();
    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        balance-=amount;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getAccNums() {
        return accNums;
    }
    /***
     * 禁止外部访问setAccNums
     */
}
