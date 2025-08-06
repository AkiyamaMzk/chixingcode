package chixing.day1210.day07_inherited;

import javax.swing.*;
import java.util.Objects;


public class Product extends chixing.day1210.day05.Product {


//    public Product(int productId, String productName, String productDescription, double productPrice) {
//        super(productId, productName, productDescription, productPrice);
//    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) return super.equals(obj);
        if (obj == null || getClass() != obj.getClass() ||
                ((Product) obj).getProductName() == null || this.getProductName() == null) return false;
        Product that = (Product) obj;
        return that.getProductPrice() == this.getProductPrice() && that.getProductName().equals(this.getProductName())
                && that.getProductId() == this.getProductId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(),getProductName(),getProductPrice());
    }

    public Product(int productId, String productName, double productPrice) {
        setProductId(productId);
        setProductName(productName);
        setProductPrice(productPrice);
    }

    public Product() {
    }

    @Override
    public String toString() {
        return super.toStringInherited();
    }
}
