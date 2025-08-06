package chixing.day1210.day09_static_interface.interfaces.homework.Q5;

public class ProductTest {
    public static void main(String[] args) {
        Product[] products = new Product[10];
        for (int i = 0; i < 10; i++) {
            if(i/5>0)
                products[i]=new ElectronicProduct(i,"ElePro"+i,i*50);
            else
                products[i]=new ClothingProduct(i,"CloPro"+i,i*50);
        }
        System.out.println("总价："+ProductUtils.getSumPrice(products));
    }
}
