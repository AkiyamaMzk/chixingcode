package chixing.day1210.day02;

import java.util.ArrayList;

public class OperationDemo {
    public static void main(String[] args) {
        byte a=1;
        int b=2;
        var c=a+b;
        int d=c;

        int x=1;
        if(false&x++==1)
            ;
        System.out.println(x);
    }
}
