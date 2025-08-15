package chixing.day10220.day20.proxy.cgclib;

import chixing.dayNull.SimpleProduct;

public class CGlibTest {
    public static void main(String[] args) {
        MyProductService productService = (MyProductService) new CGLibProxy(new MyProductService()).newProxyInstance();
        productService.add(new SimpleProduct());
    }
}
