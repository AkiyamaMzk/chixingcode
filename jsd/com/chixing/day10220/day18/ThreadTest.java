package chixing.day10220.day18;

public class ThreadTest extends Thread {
    public static void main(String[] args) {
        Thread t1 = new ThreadTest();
        Thread t2 = new ThreadTest();
        t1.setName("num");
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        if (this.getName().equals("num")) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.println((char) ('a' + i));
            }
        }
    }
}
