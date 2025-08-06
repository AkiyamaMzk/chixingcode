package chixing.day1210.day09_static_interface.interfaces.homework.Q5;

public abstract class Product {
    private int proId;
    private String proName;
    private double proPrice;
    public abstract double getDiscountedPrice();

    public Product(int proId, String proName, double proPrice) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }
}
