package chixing.day1210.day09_static_interface.interfaces;

public class CpuTest {
    public static void main(String[] args) {
        InterCpu cpu1=new InterCpu();
        Cpu cpu2=new NvidiaCpu();
        fun(cpu2);
    }
    public static void fun(Cpu cpu){
        cpu.cpuRun();
        cpu.cpuStop();
    }
}
