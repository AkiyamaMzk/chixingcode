package chixing.day10220.day14.wokr.Q1;

public class CartTest {
    public static void main(String[] args) {
        Cart cart=new Cart();
        cart.add(new Product("p1", 10, 0));
        cart.add(new Product("p2", 11, 1));
        cart.add(new Product("p3", 12, 2));
        cart.remove(1);
        cart.display();
        System.out.println(cart.getPriceSum());
    }
}
