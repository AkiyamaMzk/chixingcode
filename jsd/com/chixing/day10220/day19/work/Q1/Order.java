package chixing.day10220.day19.work.Q1;

import java.util.ArrayList;
import java.util.List;

public class Order{
    private List<Product> products=new ArrayList();
    private User user;
    private double price;
    public Order(List<Product> products, User user) {
        this.products = products;
        this.user = user;
        price=this.getPrice();
    }


    public double getPrice() {
        double res=0;
        for (Product product : products) {
            res+=product.getPrice();
        }
        return res;
    }


    public List<Product> getProducts() {
        return products;
    }


    public User getUser() {
        return user;
    }

    
}
