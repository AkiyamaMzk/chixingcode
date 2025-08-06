package chixing.day1210.day08_abstract.static_demo;

public class Mystudent {



    public static  int INT=123;
    public int studentNo;
    public String studentName;
    public long StuTeno;
    public final int FIN=1;
    /*
     * 这个属性是Student类所持有的，也就是说：调用方式为Stduent.schoolName；
     * 另外使用student（←小写的，也就是类的实例）.schoolName也不报错，但推荐使用类来调用
     * */
    public static String schoolName="蓝翔";//所有Student共用同一个

    public Mystudent(){
        System.out.println("const");
    };

    public Mystudent(int studentNo, String studentName, long stuTeno) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        StuTeno = stuTeno;
    }
    static{
        System.out.println("static");
    }


}
