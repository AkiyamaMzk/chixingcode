package chixing.day1210.day09_static_interface.interfaces.work1;

public class Mainboard {
    private VideoCard videoCard;
    private Cpu cpu;

    public Mainboard(){}
    public Mainboard(VideoCard videoCard, Cpu cpu) {
        this.videoCard = videoCard;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Mainboard{" +
                "videoCard=" + videoCard +
                ", cpu=" + cpu +
                '}';
    }

    public void run(){
        System.out.println("mainboard running");
        cpu.cpuRunning();
        videoCard.videoRunning();
    }
    public void close(){
        System.out.println("mainboard close");
        cpu.cpuClosing();
        videoCard.videoClosing();
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
