package chixing.day10220.day19.work.Q1;

public class NewUserDiscount implements DiscountStrategy{

    @Override
    public double applyDiscount(double originalPrice, User user, Product product) {
        double res=originalPrice-20>0?originalPrice-20:0;
        System.out.println("应用优惠：NewUserDiscount，减 20.0，价格变为 "+res);
        return res;
    }

}
