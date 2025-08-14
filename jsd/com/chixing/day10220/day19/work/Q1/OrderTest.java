package chixing.day10220.day19.work.Q1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderTest {
    public static void main(String[] args) {
        
            User user1 = new User("高松灯", true, false);
            User user2 = new User("千早爱音", false, true);
            User user3 = new User("丰川祥子", false, false);
            Product product1 = new Product("黑框眼镜", 50, "001", true);
            Product product2 = new Product("石头", 1, "002", false);
            Product product3 = new Product("面具", 20, "003", true);
            Product product4 = new Product("若叶睦玩偶", 3000, "004", true);
            List<Product> proListSakiko=new ArrayList<>();
            List<Product> proListAno=new ArrayList<>();
            List<Product> proListTomori=new ArrayList<>();
            proListSakiko.add(product4);
            proListAno.add(product1);
            proListTomori.add(product2);
            proListSakiko.add(product3);
            Order order1=new Order(proListTomori, user1);
            Order order2=new Order(proListAno, user2);
            Order order3=new Order(proListSakiko, user3);
            Thread task1=new Thread(new OrderTask(order1),"高松灯");
            Thread task2=new Thread(new OrderTask(order2),"千早爱音");
            Thread task3=new Thread(new OrderTask(order3),"丰川祥子");
            task1.start();
            task2.start();
            task3.start();
        
    }

}
