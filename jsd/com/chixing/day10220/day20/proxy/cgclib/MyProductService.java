package chixing.day10220.day20.proxy.cgclib;

import java.util.List;

import chixing.dayNull.SimpleProduct;

public class MyProductService  {
    public void fun1(){

    }
    public void fun2(){

    }

    public boolean add(SimpleProduct product) {
        System.out.println("商品添加实现...");

        return false;
    }


    public boolean update(SimpleProduct product) {
        System.out.println("商品修改实现...");

        return false;
    }


    public boolean delete(SimpleProduct product) {
        System.out.println("商品删除实现...");

        return false;
    }


    public List<SimpleProduct> get() {
        System.out.println("商品查询所有实现...");
        return null;
    }


    public SimpleProduct getById() {
        System.out.println("商品根据id查询实现...");
        return null;
    }
}
