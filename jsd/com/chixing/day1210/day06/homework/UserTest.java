package chixing.day1210.day06.homework;

public class UserTest {
    public static void main(String[] args) {
        VIPUser[] vipUser=new VIPUser[10];
        for(int i=0;i<10;i++) {
            vipUser[i] = new VIPUser("vip" + i, i * 10, (i + 1) / 2);
            System.out.println(vipUser[i].canAccessSpecialSale());
        }
    }
}
