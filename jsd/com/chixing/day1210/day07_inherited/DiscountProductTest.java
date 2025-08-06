package chixing.day1210.day07_inherited;

public class DiscountProductTest {
    public static void main(String[] args) {
        DiscountProduct discountProduct1 = new DiscountProduct();
        //DiscountProduct discountProduct2 = new DiscountProduct("321", 321, 0.321f);
        discountProduct1.setProductName("123");
        discountProduct1.setProductPrice(123);
        discountProduct1.setDiscountRate(0.123f);

//        System.out.println(String.format("ProductName:%1s\nProductPrice:%.2f\nDiscountRate:%.3f",
//                discountProduct1.getProductName(), discountProduct1.getProductPrice(), discountProduct1.getDiscountRate()));
//        System.out.println(discountProduct2);
        //discountProduct1.func1();

    }
}
