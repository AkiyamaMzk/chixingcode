package chixing.day1210.day08_abstract.homework;


public class Test {

    static int a=10;

    public static int test(){
        return a+=1;
    }

    public static void main(String[] args) {

        System.out.println(a+" "+test()+" "+a);
    }
}
