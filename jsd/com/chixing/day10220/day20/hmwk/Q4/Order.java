package chixing.day10220.day20.hmwk.Q4;

import java.time.LocalTime;

public class Order implements Comparable {
    private String orderId;
    private int[] customerLocation = new int[2];
    private int distanceToStore;
    private OrderPriority orderPriority;
    private LocalTime expectedDeliveryTime;
    private OrderStatus orderStatus;
    private Rider rider;

    public Order(String orderId, int[] customerLocation, int distanceToStore, OrderPriority orderPriority,
            OrderStatus orderStatus) {
        this.orderId = orderId;
        this.customerLocation = customerLocation;
        this.distanceToStore = distanceToStore;
        this.orderPriority = orderPriority;
        this.orderStatus = orderStatus;
    }

    enum OrderPriority {
        LOW, MID, HIGH
    }

    enum OrderStatus {
        PENDING, IN_PROGRESS, COMPLETED, CANCELED
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    
    public OrderPriority getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(OrderPriority orderPriority) {
        this.orderPriority = orderPriority;
    }



    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int[] getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(int[] customerLocation) {
        this.customerLocation = customerLocation;
    }

    public int getDistanceToStore() {
        return distanceToStore;
    }

    public void setDistanceToStore(int distanceToStore) {
        this.distanceToStore = distanceToStore;
    }

    public LocalTime getExpectedDeliveryTime() {
        return expectedDeliveryTime;
    }

    public void setExpectedDeliveryTime(LocalTime expectedDeliveryTime) {
        this.expectedDeliveryTime = expectedDeliveryTime;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public int compareTo(Object o) {
        Order other = (Order) o;
        // 默认 ordinal 越大优先级越高，这里取反保证 HIGH 在前
        return Integer.compare(other.orderPriority.ordinal(), this.orderPriority.ordinal());
    }

}
