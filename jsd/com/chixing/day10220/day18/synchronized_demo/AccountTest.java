package chixing.day10220.day18.synchronized_demo;

import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟1000个终端，向这一个账户存1元， 再取1元
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account("katy", 500);// `共享资源/临界资源`

        for (int i = 0; i < 1000; i++) {
            AccountThread thread = new AccountThread(acc);
            if (i < 500)
                thread.setName("depoist");
            thread.start();
        }
        System.out.println("--------账户的余额是：-------------" + acc.getBanlance());
    }
}
