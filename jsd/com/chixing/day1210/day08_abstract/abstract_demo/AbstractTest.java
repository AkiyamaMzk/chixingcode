package chixing.day1210.day08_abstract.abstract_demo;

import java.util.Calendar;

public class AbstractTest {
    public static void main(String[] args) {

        //instantiated 实例化 = 创建对象
        // instant 实例(对象)

//        Account account =   new Account();  error 抽象类不能被实例化

        SavingAccount sa1 = new SavingAccount();
        Account acc1 = new SavingAccount();

        Account acc2 = new CreditAccount();
        LoanAccount la1 = new LoanAccount();

        //
        fun1(sa1);
    }

    // 参数是抽象类，实参 一定是 该抽象类的 子类对象
    public static void fun1(Account account){ // Account account =  SavingAccount sa1 = new SavingAccount();
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
    }

}
