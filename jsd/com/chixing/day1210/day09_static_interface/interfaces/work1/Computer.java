package chixing.day1210.day09_static_interface.interfaces.work1;

import com.sun.tools.javac.Main;

public class Computer {
    Mainboard mainboard;



    public Computer(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    public Computer() {
    }

    public static void main(String[] args) {
        VideoCard videoCard = bugVideoCard("Nvidia");
        Cpu cpu = bugCpu("Inter");
        Mainboard mainboard = buymainboard();
        mainboard.setCpu(cpu);
        mainboard.setVideoCard(videoCard);
        Computer computer=new Computer(mainboard);
        computer.open();
        System.out.println("硬件信息：");
        System.out.println(mainboard);
        System.out.println();
        computer.close();
    }
    public static VideoCard bugVideoCard(String videCardType) {
        if(videCardType.equals("Nvidia"))
        return new NvidiaVideoCard();
        else return null;
    }
    public static Cpu bugCpu(String cpuType) {
        if(cpuType.equals("Inter"))
        return new InterCpu();
        else return null;
    }
    public static Mainboard buymainboard() {
        return new Mainboard();
    }
    public void open() {
        System.out.println("Computer opening");
        this.mainboard.run();
    }
    public void close() {
        System.out.println("Computer closing");
        this.mainboard.close();
    }
}
