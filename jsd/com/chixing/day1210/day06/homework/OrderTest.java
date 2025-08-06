package chixing.day1210.day06.homework;

public class OrderTest {
    public static void main(String[] args) {
        OnlineOrder onlineOrderList[]=new OnlineOrder[3];
        for(int i=0;i<3;i++) {
            onlineOrderList[i] = new OnlineOrder(i, i * 5.0, i + "test@testmail");
            onlineOrderList[i].printOnlineOrder();
            System.out.println();
        }
    }

}
