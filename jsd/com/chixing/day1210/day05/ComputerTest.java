package chixing.day1210.day05;

public class ComputerTest {
    public static void main(String[] args) {

        MainBoard mainBoard=new MainBoard();
        mainBoard.setMainboardBrand("测试品牌");
        mainBoard.setMainboardType("Test001");
        mainBoard.setMainboardprice(12345);

        Video video=new Video();
        video.setVideoBrand("测试品牌");
        video.setVideoType("TEST-123");
        video.setVideoprice(123456);

        Compiuter compiuter1=new Compiuter(mainBoard,video);
        System.out.println(compiuter1);
    }
}
