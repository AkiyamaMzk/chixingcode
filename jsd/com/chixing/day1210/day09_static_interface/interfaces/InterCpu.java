package chixing.day1210.day09_static_interface.interfaces;

public class InterCpu implements Cpu {
    @Override
    public void cpuRun() {
        System.out.println("inter yes");
    }

    @Override
    public void cpuStop() {
        System.out.println("inter no");
    }
}
