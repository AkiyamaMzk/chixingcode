package chixing.day10220.day14.map;

import chixing.dayNull.SimpleProduct;

public class Product extends SimpleProduct {
    private int productId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Product() {
    }

    public Product(int productId) {
        this.productId = productId;
    }

    public Product(int productId, String name, double price) {
        super(name, price);
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + "]"+super.toString();
    }

    
    
    

}
