package chixing.day10220.day12;

import chixing.day10220.day12.exception.BalanceNotEnoughException;

public class AccTest {
    public static void main(String[] args) throws BalanceNotEnoughException {
        CreditAccount acc1 = new CreditAccount();
        acc1.setAccBalance(200);
        acc1.withdraw(100);
        acc1.transfer(0.22,new CreditAccount());
    }
}
