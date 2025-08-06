package chixing.day10220.day11.worrrrrrk.Q10;

public abstract class PricingStrategyImp implements PricingStrategy{
    protected Product product;

    public double discountStrategy(double rate) {
        return product.getPrice()*product.getQuantity()* rate;
    }

    public double fullReductionStrategy(double threshold, double reduction) {
        if (product.getPrice()* product.getQuantity() >= threshold) return product.getPrice()* product.getQuantity() - reduction;
        else return product.getPrice()* product.getQuantity();
    }

    public double buyOneGetOneStrategy() {
         return product.getPrice()*(product.getQuantity()+1)/2;
    }

    @Override
    public abstract double calculate(Product product);
}
