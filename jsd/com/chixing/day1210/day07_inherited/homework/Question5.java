package chixing.day1210.day07_inherited.homework;

public class Question5 {
    public static class Printer{
        public void print(String msg){
            System.out.println("Printing: " + msg);
        }
    }
    public static class ColorPrinter extends Printer{
        public void print(String msg, String color){
            System.out.printf("Printing in [%s]: [%s]\n",color,msg);
        }
    }

    public static void main(String[] args) {
        ColorPrinter cp1=new ColorPrinter();
        cp1.print("msg1","color1");
        cp1.print("msg1");
        /*
        ColorPrinter.print与Printer.print的参数不同,构成函数重载,故不会覆盖
        在参数相同时会构成函数重写,不相同时构成函数重载
        需要多种方法时使用重载,需要增强原有方法时使用函数重写
         */
    }
}
