package chixing.day1210.day05;

public class ShopTest {
    public static void main(String[] args) {
        /**
         * new :开辟一块堆内存
         * shop():初始化对象属性，执行构造函数;
         *
         */

        Shop shop1=new Shop(101,"海底捞","总店",4.8f);
        Shop shop2=new Shop(102,"金拱门");
        Shop shop3=new Shop();
        shop3.setShopId(103);

    }
}
