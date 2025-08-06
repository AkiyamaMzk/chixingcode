package chixing.day1210.day09_static_interface.interfaces;

public class NvidiaCpu implements  Cpu{

    @Override
    public void cpuRun() {
        System.out.println("NVIDIA YES!");
    }

    @Override
    public void cpuStop() {
        System.out.println("NVIDIA NO!");
    }
}
