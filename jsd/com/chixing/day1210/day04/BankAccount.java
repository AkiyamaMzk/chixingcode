package chixing.day1210.day04;

public class BankAccount {

    public BankAccount(int type){
        this.setAccType(String.valueOf(type));
    }
    public BankAccount(){}

    private int accNO;
    private String accName;
    private String accPassword;
    private String accTelno;
    private double accBalance;

    private boolean accType;

    public int getAccNO() {
        return accNO;
    }

    public void setAccNO(int accNO) {
        this.accNO = accNO;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }

    public String  getAccTelno() {
        return accTelno;
    }

    public void setAccTelno(String  accTelno) {
        this.accTelno = accTelno;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public String getAccType() {
        if (this.accType==true) return "信用账户";
        return "储蓄账户";
    }

    public void setAccType(String accType) {
        if ((accType.equals("1") || accType.equals("信用账户")))this.accType=true;
        else this.accType=false;
    }

    public void depoist(double moeny){
        this.setAccBalance(this.accBalance+moeny);
    }

    public void withdraw(double moeny){
        if(this.accBalance<moeny){
            System.out.println("余额不足");
            return;
        }
        this.setAccBalance(this.accBalance-moeny);
    }

    public String toString(){
        String information="账号:"+this.accNO+
                "\n姓名:"+this.accName+
                "\n密码:"+this.accPassword+
                "\n手机号:"+this.accTelno+
                "\n账户余额:"+this.accBalance+
                "\n账户类型:"+this.getAccType();
        return information;
    }
}
