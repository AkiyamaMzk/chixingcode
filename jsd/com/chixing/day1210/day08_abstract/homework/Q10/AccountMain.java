package chixing.day1210.day08_abstract.homework.Q10;



public class AccountMain {
    public static void main(String[] args) {
        MyCheckingAccount ac1=new MyCheckingAccount(1,100);
        MySavingsAccount ac2=new MySavingsAccount(2,200);
        ac1.deposit(10);
        ac2.withdraw(20);
        System.out.println("ac1:"+ac1.getBalance()+" ac2:"+ac2.getBalance());
        ac1.monthlyUpdate();
        ac2.monthlyUpdate();
        System.out.println("ac1:"+ac1.getBalance()+" ac2:"+ac2.getBalance());
        System.out.println(BankAccount.getAccNums());
    }
}
