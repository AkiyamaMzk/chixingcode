package chixing.day1210.day09_static_interface.interfaces.work1;

public class InterCpu implements Cpu {
    @Override
    public String toString() {
        return "InterCpu{}";
    }
    @Override
    public void cpuRunning() {
        System.out.println("Inter cpu running");
    }
    @Override
    public void cpuClosing() {
        System.out.println("Inter cpu closing");
    }



}
