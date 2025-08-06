package chixing.day1210.day08_abstract.abstract_demo;

import java.util.HashSet;
import java.util.Set;

import chixing.day1210.day08_abstract.abstract_demo.Product;

public class ProductTest {
    public static void main(String[] args) {
        //100个 new Product(....)
        Product p1= new Product(101,"aaa");
        Product p2= new Product(102,"fjsods");
        Product p3= new Product(103,"dsskjds");
        Product p4= new Product(104,"dsff");
        Product p5= new Product(105,"tht");
        Product p6= new Product(105,"tht");
        // Set容器： 元素不能重复(不同) Set (alt + enter)
        Set set = new HashSet();
        set.add(p1);  // hashcode()
        set.add(p2);// hashcode()
        set.add(p3);// hashcode()
        set.add(p4);// hashcode()
        set.add(p5);// hashcode()
        set.add(p6);// hashcode() - equals()

        set.forEach(System.out::println);




    }
}
