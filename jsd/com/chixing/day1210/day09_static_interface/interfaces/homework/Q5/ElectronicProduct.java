package chixing.day1210.day09_static_interface.interfaces.homework.Q5;

public class ElectronicProduct extends Product{

    public ElectronicProduct(int proId, String proName, double proPrice) {
        super(proId, proName, proPrice);
    }

    @Override
    public double getDiscountedPrice() {
        return this.getProPrice()-20;
    }
}
