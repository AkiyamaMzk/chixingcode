package chixing.day10220.day20.hmwk.Q2;

public class OrderTask implements Runnable {
    private Order order;
    private Product product;

    

    public OrderTask(Order order) {
        this.order = order;
        this.product = order.getProduct();
    }

    @Override
    public void run() {
        try {
            buy();
        } catch (Exception e) {
            System.out.println("订单取消");
        }
        System.out.println("用户下单成功：订单ID:" + order.getOrderId() + " 商品: " + product.getName() + " 数量:"
                + order.getQuantity() + " 支付金额:" + order.getPrice() + " 剩余库存: " + product.getProductStock());
    }

    public synchronized void buy() {
        if (product.getProductStock()>order.getQuantity()) {
            product.setProductStock(product.getProductStock()-order.getQuantity());
        }
        else
            throw new RuntimeException("库存不足，购买失败"); 
    }
}
