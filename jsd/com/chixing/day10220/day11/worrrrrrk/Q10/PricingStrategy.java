package chixing.day10220.day11.worrrrrrk.Q10;

public interface PricingStrategy {

    double calculate(Product product);

    public double discountStrategy(double rate);

    public double fullReductionStrategy(double threshold, double reduction);

    public double buyOneGetOneStrategy();
}
