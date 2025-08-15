package chixing.day10220.day19.work.Q1;

public interface DiscountStrategy {
    double applyDiscount(double originalPrice, User user, Product product);
    
}
