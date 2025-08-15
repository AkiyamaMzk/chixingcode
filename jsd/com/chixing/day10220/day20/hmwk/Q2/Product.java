package chixing.day10220.day20.hmwk.Q2;

import chixing.dayNull.SimpleProduct;

public class Product extends SimpleProduct {
    private String productId;
    private int productStock;// 库存

    public String getProductId() {
        return productId;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }




    public Product(String name, double price, String productId, int productStock) {
        super(name, price);
        this.productId = productId;
        this.productStock = productStock;
    }
    
    
}
