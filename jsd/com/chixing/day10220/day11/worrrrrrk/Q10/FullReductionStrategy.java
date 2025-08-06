package chixing.day10220.day11.worrrrrrk.Q10;

public class FullReductionStrategy extends PricingStrategyImp{
    private double threshold;
    private double reduction;

    public FullReductionStrategy(double threshold, double reduction) {
        this.threshold = threshold;
        this.reduction = reduction;
    }
    @Override
    public double calculate(Product product) {
        this.product=product;
        return fullReductionStrategy(threshold,reduction);
    }

    @Override
    public String toString() {
        return "满"+threshold+"减"+reduction;
    }
}
