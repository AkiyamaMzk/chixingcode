package chixing.day1210.day09_static_interface.interfaces.homework.Q6;

public abstract class Order {
    private int orderId;
    private double orderPrice;
    public abstract String getOrderType();
    {
        OrderManager.ordersum++;
    }
}
