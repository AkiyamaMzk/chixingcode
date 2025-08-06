package chixing.day1210.day09_static_interface.interfaces.homework.Q5;

public final class ProductUtils {
    public static double getSumPrice(Product[] proArray){
        double res=0;
        for(Product p:proArray)
            res+=p.getDiscountedPrice();
        return res;
    }
}
