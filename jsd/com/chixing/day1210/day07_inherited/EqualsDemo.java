package chixing.day1210.day07_inherited;

public class EqualsDemo {
    public static void main(String[] args) {
        Product product1= new Product(101,"手壳",20);
        Product product2= new Product(101,"手壳",20);
        System.out.println(product1.equals(product2));
    }
}
