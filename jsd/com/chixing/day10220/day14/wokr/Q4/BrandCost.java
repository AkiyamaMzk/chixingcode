package chixing.day10220.day14.wokr.Q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chixing.day10220.day13.echiwork.Q5.ProductWithBrand;

class Product extends ProductWithBrand {
    public Product(String brand, String name, double price) {
        super(name, price, brand);
    }
}

public class BrandCost {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        {//添加数据
            Product p1 = new Product("宝洁", "洗手粉", 18.5);
            Product p2 = new Product("联合利华", "肥皂", 4.5);
            Product p3 = new Product("宝洁", "牙膏", 32.5);
            Product p4 = new Product("宝洁", "毛巾", 14.5);
            Product p5 = new Product("洁利", "洗面奶", 26.0);
            Product p6 = new Product("好迪", "洗发水", 27.5);
            Product p7 = new Product("多芬", "沐浴露", 38.5);
            Product p8 = new Product("宝洁", "洗洁精", 3.4);
            list.add(p1);
            list.add(p2);
            list.add(p3);
            list.add(p4);
            list.add(p5);
            list.add(p6);
            list.add(p7);
            list.add(p8);
        }
        HashMap<String, Double> map = new HashMap<>();
        // for (Product product : list) {
        //     map.put(product.getBrand(), (Double) map.getOrDefault(product.getBrand(), 0.0) + product.getPrice());
        // }
        
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " 总花费: " + entry.getValue());
        }
        
    }
}
