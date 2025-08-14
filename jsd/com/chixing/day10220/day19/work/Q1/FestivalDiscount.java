package chixing.day10220.day19.work.Q1;

public class FestivalDiscount implements DiscountStrategy {
    private Product product;

    public FestivalDiscount(Product product) {
        this.product = product;
    }

    @Override
    public double applyDiscount(double originalPrice, User user, Product product) {
        double res = originalPrice * 0.9;
        System.out.println("应用优惠：FestivalDiscount，9 折，" + product.getName() + "价格变为 " + res);
        return res;
    }

    public Product getProduct() {
        return product;
    }

}
