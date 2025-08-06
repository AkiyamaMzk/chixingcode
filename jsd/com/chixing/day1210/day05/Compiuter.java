package chixing.day1210.day05;

public class Compiuter {
    private MainBoard mainBoard;
    private Video video;

    public Compiuter(MainBoard mainBoard,Video video){
        this.mainBoard=mainBoard;
        this.video=video;
    }

    @Override
    public String toString() {
        return "Compiuter{" +
                "mainBoard=" + mainBoard +
                ", video=" + video +
                '}';
    }
}
