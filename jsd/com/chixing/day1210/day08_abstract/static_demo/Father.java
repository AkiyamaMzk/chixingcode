package chixing.day1210.day08_abstract.static_demo;

public class Father {
    static int a=10;
    static {
        System.out.println("Father static");
    }
    {
        System.out.println("Father codes");
    }

}
