package chixing.day1210.day10.innerclass;

import chixing.day1210.day09_static_interface.interfaces.work1.Cpu;

public class Outer {
    public static int out = 1;

    static {
        //System.out.println(Inner.in);
        System.out.println("outer static");
    }

    public class Inner {
        public static int in = 2;

        static {
            //  System.out.println(out);
            System.out.println("innter static");
        }
    }

    public static void func(Cpu cpu) {
        System.out.println(cpu);
    }


}
