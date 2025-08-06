package chixing.day10220.day11.worrrrrrk.Q10;

public class DiscountStrategy extends PricingStrategyImp {
    private double rate;
    public DiscountStrategy(double rate) {
        this.rate = rate;
    }
    @Override
    public double calculate(Product product) {
        this.product=product;
        return discountStrategy(rate);
    }

    @Override
    public String toString() {
        return (int)(rate*10)+"折";
    }
}
