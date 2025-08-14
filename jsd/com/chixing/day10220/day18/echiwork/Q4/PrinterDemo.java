package chixing.day10220.day18.echiwork.Q4;

public class PrinterDemo {
    public static void main(String[] args) {
        Printer p=new Printer();
        String[] documentNames = {"文件1", "文件2", "文件3", "文件4"};
        for (String name : documentNames) {
            Thread t=new Thread(p,name);
            t.setName(name);
            t.start();
        }
    }
}
