package chixing.day1210.day10.innerclass;

import chixing.day1210.day09_static_interface.interfaces.work1.Cpu;

public class OuterTest {
    public static void main(String[] args) throws ClassNotFoundException {
      //  Class.forName("chixing.day10.innerclass.Outer$Inner");
        Outer.func(new Cpu() {
            @Override
            public void cpuRunning() {
                return;
            }

            @Override
            public void cpuClosing() {
                return;
            }
        });
    }
}
