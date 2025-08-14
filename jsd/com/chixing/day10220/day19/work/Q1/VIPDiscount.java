package chixing.day10220.day19.work.Q1;

public class VIPDiscount implements DiscountStrategy{

    @Override
    public double applyDiscount(double originalPrice, User user, Product product) {
        double res=originalPrice*0.95;
        System.out.println("应用优惠：VIPDiscount，95 折，价格变为"+res);
        return res;
    }

}
