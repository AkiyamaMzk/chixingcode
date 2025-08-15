package chixing.day10220.day20.hmwk.Q2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShopMain {
    public static void main(String[] args) {
        List<Product> proList=new ArrayList<>();
        Product product1=new Product("可乐", 3, "001", 300);
        Product product2=new Product("口香糖", 0.5, "002", 200);
        Product product3=new Product("面包", 2, "003", 40);
        Product product4=new Product("牛奶", 2.5, "004", 60);
        proList.add(product1);
        proList.add(product2);
        proList.add(product3);
        proList.add(product4);
        FlashSale flashSale1=new FlashSale(product1, 0.5, LocalDateTime.now(), LocalDateTime.now().plusDays(2));
        useflashSale(flashSale1, proList);
        Order order1=new Order("001", product4, 2);
        Order order2=new Order("002", product1, 20);
        Order order3=new Order("003", product3, 5);
        OrderTask task1=new OrderTask(order1);
        OrderTask task2=new OrderTask(order2);
        OrderTask task3=new OrderTask(order3);
        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        Thread t3=new Thread(task3);
        t1.start();
        t2.start();
        t3.start();
    }
    private static void useflashSale(FlashSale flashSale,List<Product> products){
        if (LocalDateTime.now().isBefore(flashSale.getStartTime()) || LocalDateTime.now().isAfter(flashSale.getEndTime())) {
            return;
        }
        for (Product product : products) {
            if (flashSale.getProduct().equals(product)) {
                product.setPrice(product.getPrice()*flashSale.getDiscount());
            }
        }
    }
}
