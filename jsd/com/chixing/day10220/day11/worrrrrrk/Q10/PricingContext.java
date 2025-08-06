package chixing.day10220.day11.worrrrrrk.Q10;

public class PricingContext {
    private PricingStrategy strategy;
    public void setStrategy(PricingStrategy strategy){
        this.strategy=strategy;
    }
    public double calculateFinalPrice(Product p){
        return strategy.calculate(p);
    }

    public PricingStrategy getStrategy() {
        return strategy;
    }
}
