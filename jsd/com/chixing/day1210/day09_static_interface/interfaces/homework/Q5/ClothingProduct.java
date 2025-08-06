package chixing.day1210.day09_static_interface.interfaces.homework.Q5;

public class ClothingProduct extends Product{
    public ClothingProduct(int proId, String proName, double proPrice) {
        super(proId, proName, proPrice);
    }

    @Override
    public double getDiscountedPrice() {
        return getProPrice()*0.95;
    }
}
