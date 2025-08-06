package chixing.day1210.day09_static_interface.interfaces.homework.Q4;

public class Music extends MediaFile implements Playable, Downloadable {


    public Music(String fileName, int fileSize, String downloadUrl) {
        super(fileName, fileSize);
    }

    @Override
    public void download(String url) {
        System.out.println("music: "+url+" is "+"downloading");
    }

    @Override
    public void play() {
        System.out.println("music: "+ this.fileName+" is playing");
    }

    public Music(String fileName, int fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public void stop() {
        System.out.println("music stopping");
    }
}
