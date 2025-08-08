package chixing.day10220.day14.wokr.Q1;

import java.util.ArrayList;
import java.util.List;

import chixing.dayNull.SimpleProduct;

public class Cart{ // 容器
    private List<Product> productList; // 声明变量
	private double priceSum;
    
    
    // 构造函数的作用 ： 初始化对象（初始化购物车）
	public Cart(){
		productList = new ArrayList<>();
		priceSum=0;
	}
	 // 增加
	public void add(Product product){
		productList.add(product);
		priceSum+=product.getPrice();
	}
	
	//根据下标获得
	public Product get(int index){
		return productList.get(index);
	}
    //根据商品名称获得
	public Product get(String productName){
		for (Product product : productList) {
			if(product.getName().equals(productName))
				return product;
		}
		return null;
	}
	//删除
	public Product remove(int index){//?
		productList.remove(index);
		priceSum-=productList.get(index).getPrice();
		return null;
	}
	
	//遍历
	public void display(){
		for (Product product : productList) {
			System.out.println(product);
		}
	}
	public double getPriceSum(){
		return priceSum;
	}

}



class Product extends SimpleProduct{
	private int productId;

	public Product(String name, double price, int productId) {
		super(name, price);
		this.productId = productId;
	}

    public int getProductId() {
        return productId;
    }
	
	
	
}





