package chixing.day10220.day20.hmwk.Q2;

public class Order {
    private String orderId;
    private Product product;
    private int quantity;
    private double price;
    public String getOrderId() {
        return orderId;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price=product.getPrice()*quantity;
    }
    public Order(String orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }
    



    

    
}
