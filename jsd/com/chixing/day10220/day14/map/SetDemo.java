package chixing.day10220.day14.map;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        HashSet: 元素不能重复，无序的   -- 重写 hashcode()与equals()
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(30);
        set1.add(10);
        set1.add(20);
        set1.add(70);
        set1.add(10);
        System.out.println(set1);
//        实际业务中，比较两个对象 是不是同一个对象，比较是 内容值，为了提高比较效率，需要 重写 hashcode()与equals()
//        HashSet<Student> set1 = new HashSet<>();   -- Student类 重写 hashcode()与equals()
//        HashSet<Product> set1 = new HashSet<>();   --Product类 重写 hashcode()与equals()

//        TreeSet: 元素不能重复，有序
        TreeSet<Integer> set2 = new TreeSet<>();  // 每两个 Integer 整数对象， 实现了比较的先后顺序
        set2.add(30);
        set2.add(10);
        set2.add(20);
        set2.add(70);
        set2.add(10);
        System.out.println(set2);

//        TreeSet<Student> set1 = new TreeSet<>();   -- Student对象  有序不重复， 底层要求 两个Student对象  实现比较的先后顺序
        TreeSet<Product> setPro = new TreeSet<>(); //  -- Product对象  有序不重复， 底层要求 两个Product对象  实现比较的先后顺序
        Product product1 = new Product(10010, "shoujike", 20);
        Product product2 = new Product(10267, "kafei", 20);
        Product product3 = new Product(10839, "shubiao", 99);
        Product product4 = new Product(10275, "beizi", 30);
        Product product5 = new Product(10010, "shoujike", 20);

        setPro.add(product1);
        setPro.add(product2);
        setPro.add(product3);
        setPro.add(product4);
        setPro.add(product5);

        // set 遍历输出
        for(Product pro:setPro){
            System.out.println(pro);
        }



    }
}
