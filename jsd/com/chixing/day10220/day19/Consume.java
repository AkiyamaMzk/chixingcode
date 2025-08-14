package chixing.day10220.day19;

public class Consume extends Thread {
    private PublicREsource resource;

    public Consume(PublicREsource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            resource.consume();
        }
    }
}
