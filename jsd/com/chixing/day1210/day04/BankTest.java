package chixing.day1210.day04;

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount(0);
        BankAccount acc2=new BankAccount(1);
        acc1.setAccNO(1);
        acc1.setAccName("张三");
        acc1.setAccPassword("123456");
        acc1.setAccTelno("12345671910");
        acc1.setAccBalance(99999999999.99);
        acc2.setAccNO(2);
        acc2.setAccName("李四");
        acc2.setAccPassword("123456789");
        acc2.setAccTelno("10987654321");
        acc2.setAccBalance(0);
        System.out.println(acc1);
        System.out.println(acc2);
        acc1.setAccTelno("183389849");
        acc2.depoist(1000);
        acc2.withdraw(500);
        System.out.println("余额"+acc2.getAccBalance());
    }
}
