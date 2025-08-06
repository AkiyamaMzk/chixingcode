package chixing.day1210.day09_static_interface.interfaces.work1;

public class NvidiaVideoCard implements VideoCard{
    @Override
    public String toString() {
        return "NvidiaVideoCard{}";
    }
    @Override
    public void videoRunning() {
        System.out.println("Nvidia videocard running");
    }
    @Override
    public void videoClosing() {
        System.out.println("Nvidia videocard Closing");
    }
}
