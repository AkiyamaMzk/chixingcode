package chixing.day10220.day18.echiwork.Q4;

public class PrinterDemo {
    public static void main(String[] args) {
        String[] documentNames = {"文件1", "文件2", "文件3", "文件4"};
        for (String name : documentNames) {
            Printer t=new Printer();
            t.setName(name);
            t.start();
        }
        
    }
}
