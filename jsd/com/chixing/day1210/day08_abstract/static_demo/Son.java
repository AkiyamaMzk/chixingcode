package chixing.day1210.day08_abstract.static_demo;

public class Son extends Father{
    static int a=10;
    static {
        System.out.println("son static");
    }
    {
        System.out.println("son codes");
    }
}
