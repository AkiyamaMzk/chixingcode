package chixing.day10220.day20.hmwk.Q2;

import java.time.LocalDateTime;

public class FlashSale {
    private Product product;
    private double discount;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    public FlashSale(Product product, double discount, LocalDateTime startTime, LocalDateTime endTime) {
        this.product = product;
        this.discount = discount;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public Product getProduct() {
        return product;
    }
    public double getDiscount() {
        return discount;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }
    
    
}
