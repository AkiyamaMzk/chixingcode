package chixing.day1210.day09_static_interface.interfaces.homework.Q4;

public class MusicTest {
    public static void main(String[] args) {

        Music[] music=new Music[5];
        for(int i=0;i<5;i++)
        {
            music[i]=new Music("testmusic"+i,i*5);
            music[i].download("musicdown/"+i);
            music[i].play();
        }
    }
}
