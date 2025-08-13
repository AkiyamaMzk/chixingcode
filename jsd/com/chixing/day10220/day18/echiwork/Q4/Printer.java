package chixing.day10220.day18.echiwork.Q4;

public class Printer extends Thread {
    private static synchronized void printDocument(String documentName) {
        System.out.println("正在打印:" + documentName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(documentName + "打印完成！");
    }

    @Override
    public void run() {
        printDocument(this.getName());
    }

}
