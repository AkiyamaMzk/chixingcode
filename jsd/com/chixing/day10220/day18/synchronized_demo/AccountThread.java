package chixing.day10220.day18.synchronized_demo;

public class AccountThread extends Thread {
    private Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        if (this.getName().equals("depoist"))
            account.depoist(1);
        else
            account.withdraw(1);
    }
}
