package chixing.day10220.day19.work.Q1;

import chixing.dayNull.SimpleProduct;

public class Product extends SimpleProduct{
    private String ProductId;
    private boolean IsFestivalPromotional;//促销？

    public Product(String name, double price, String productId, boolean isFestivalPromotional) {
        super(name, price);
        ProductId = productId;
        IsFestivalPromotional = isFestivalPromotional;
    }
    public String getProductId() {
        return ProductId;
    }
    public boolean isIsFestivalPromotional() {
        return IsFestivalPromotional;
    }
    
}
