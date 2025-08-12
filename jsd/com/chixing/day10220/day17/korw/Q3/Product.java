package chixing.day10220.day17.korw.Q3;

import chixing.dayNull.SimpleProduct;

public class Product extends SimpleProduct{
    private Integer proId;
    private String proSupplier;
    private int proStock;
    public Product(Integer proId, String proSupplier, int proStock,String name) {
        this.setName(name);
        this.proId = proId;
        this.proSupplier = proSupplier;
        this.proStock = proStock;
    }
    public void changeStock(int n){
        this.proStock+=n;
    }
    public Integer getProId() {
        return proId;
    }
    public String getProSupplier() {
        return proSupplier;
    }
    public int getProStock() {
        return proStock;
    }
    
}
