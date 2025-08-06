package chixing.day10220.day13.echiwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import chixing.dayNull.SimpleProduct;

public class Q3 {
    public static void main(String[] args) {
        Set<SimpleProduct> productSet = new HashSet<>();
        productSet.add(new SimpleProduct("produce1", 100));// 使用了price代替id
        productSet.add(new SimpleProduct("produce2", 200));
        productSet.add(new SimpleProduct("produce3", 300));
        productSet.add(new SimpleProduct("produce4", 400));
        productSet.add(new SimpleProduct("produce5", 500));
        for (SimpleProduct simpleProduct : productSet) {
            System.out.println(simpleProduct);
        }

        System.out.println();
        productSet.add(new SimpleProduct("producesame", 10));
        productSet.add(new SimpleProduct("producesame", 10));
        for (SimpleProduct simpleProduct : productSet) {
            System.out.println(simpleProduct);
        }

        System.out.println();
        List<SimpleProduct> productsList = new ArrayList<>();
        for (SimpleProduct simpleProduct : productSet) {
            if (simpleProduct.getPrice() > 300)
                productsList.add(simpleProduct);
        }
        for (SimpleProduct simpleProduct : productsList) {
            System.out.println(simpleProduct);
        }
    }
}
