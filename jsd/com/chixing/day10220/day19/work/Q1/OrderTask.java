package chixing.day10220.day19.work.Q1;

import java.util.HashSet;
import java.util.Set;


public class OrderTask implements Runnable {
    private Order order;
    private Set<DiscountStrategy> discountStrategys = new HashSet<>();

    public OrderTask(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        double price = order.getPrice();
        if (order.getUser().isNewUser()) {
            discountStrategys.add(new NewUserDiscount());
        }
        if (order.getUser().isVIP()) {
            discountStrategys.add(new VIPDiscount());
        }
        for (Product product : order.getProducts()) {
            if (product.isIsFestivalPromotional())
                discountStrategys.add(new FestivalDiscount(product));
        }
        System.out.println("原始价格：" + price);
        for (DiscountStrategy discountStrategy : discountStrategys) {
            double sumFest = 0;
            if (discountStrategy instanceof FestivalDiscount) {
                double tempprice = ((FestivalDiscount) discountStrategy).getProduct().getPrice();
                double temp = price;
                price -= tempprice;
                price += discountStrategy.applyDiscount(tempprice, order.getUser(),
                        ((FestivalDiscount) discountStrategy).getProduct());
                sumFest += temp - price;
            } else
                price = discountStrategy.applyDiscount(price, order.getUser(), null);
        }
        System.out.println("最终价格：" + price);
    }

}
