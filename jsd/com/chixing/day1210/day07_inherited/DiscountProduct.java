package chixing.day1210.day07_inherited;

public class DiscountProduct extends Product{
    private  float discountRate;
    private String test;

    public void func1(){
        this.test="321";
        System.out.println(this.test+super.test);
    }


    public DiscountProduct(int productId,String productName, double productPrice,float discountRate) {
        super(productId,productName, productPrice);
        this.discountRate=discountRate;
    }

    public DiscountProduct() {
    }
    public DiscountProduct(float discountRate) {
        this.discountRate=discountRate;
    }

    public float getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return super.toString()+ "DiscountProduct{" +
                "discountRate=" + discountRate +
                '}';
    }
}
