package chixing.day1210.day06.inherited;

public class AccountTest {
    public static void main(String[] args) {
        SavingAccout acc1=new SavingAccout();
        CreditAccout acc2=new CreditAccout("2","acc2","2",
                123456789,0.0d,0.0d,0.0d);
        acc1.setAccName("kaf");
        acc1.withdraw(123);
        acc1.withdraw(123);
        SavingAccout acc12=new SavingAccout("2","acc12","12",12345,12);
        CreditAccout acc22=new CreditAccout();
    }
}
