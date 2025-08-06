package chixing.day1210.day05;

public class ProductTest {
    public static void main(String[] args) {
        Product[] products=new Product[5];
        for(int i=0;i<5;i++){
            products[i]=new Product(i,"测试商品"+(i+1),"测试描述"+(i+1),100+i*100);
            System.out.println(products[i]);
        }
        for(int i=0;i<5;i++){
            if(products[i].getProductPrice()>300) System.out.println(products[i].getProductName());
        }
    }
}
