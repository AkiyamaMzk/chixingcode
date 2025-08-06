package chixing.day1210.day08_abstract.static_demo;

public class ExampleClass {
    private static String staticString="我是staticString";

    public static String getStaticString() {
        return staticString;
    }

    public static void setStaticString(String staticString) {
        ExampleClass.staticString = staticString;
    }

    public ExampleClass(){
        setStaticString("更改了staticString");
    }
    static{
        System.out.println(staticString);//←可以在这里使用static实例,但要注意实例的定义需要先于static代码块
    }
}
