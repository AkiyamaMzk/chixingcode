package chixing.day10220.day20.hmwk.Q4;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import chixing.day10220.day20.hmwk.Q4.Order.OrderStatus;

public class DispatchServiceImp implements DispatchService {
    List<Rider> riders = new ArrayList<>();
    List<Order> pendingOrders = new ArrayList<>();

    @Override
    public void addOrder(Order order) {
        pendingOrders.add(order);
    }

    @Override
    public synchronized Rider dispatch(Order order) {

        int minIndex = 0;
        double minLocation = Double.MAX_VALUE;
        List<Rider> availableRiders = getAvailableRiders();
        for (int i = 1; i < availableRiders.size(); i++) {
            if (availableRiders.get(i).isRiderAvailable()
                    && (getLocation(availableRiders.get(i).getRiderLocation(),
                            order.getCustomerLocation()) < minLocation)) {
                minIndex = i;
                minLocation = getLocation(order.getCustomerLocation(),
                        availableRiders.get(i).getRiderLocation());
            }
        }
        Rider res = availableRiders.get(minIndex);
        res.setCurrentOrderCount(res.getCurrentOrderCount() + 1);
        order.setRider(res);
        order.setOrderStatus(OrderStatus.IN_PROGRESS);
        order.setExpectedDeliveryTime(expectedDeliveryTime(order));
        return res;
    }

    @Override
    public void finishDelivery(Rider rider, Order order) {
        order.setOrderStatus(OrderStatus.COMPLETED);
        rider.setCurrentOrderCount(rider.getCurrentOrderCount() - 1);
    }

    @Override
    public List<Order> getOrdersByRider(Rider rider) {
        List<Order> res = new ArrayList<>();
        for (Order order : pendingOrders) {
            if (order.getRider() == rider)
                res.add(order);
        }
        return res;
    }

    @Override
    public List<Rider> getAvailableRiders() {
        List<Rider> res = new ArrayList<>();
        for (Rider rider : riders) {
            if (rider.isRiderAvailable()) {
                res.add(rider);
            }
        }
        return res;
    }

    @Override
    public void addRider(Rider rider) {
        riders.add(rider);
    }

    

    private double getLocation(int[] a, int[] b) {
        int dx = b[0] - a[0];
        int dy = b[1] - a[1];
        double res = Math.sqrt(dx * dx + dy * dy);
        return res;
    }

    @Override
    public synchronized Set<Order> getAllOrder() {
        return new TreeSet<>(pendingOrders);
    }

    public LocalTime expectedDeliveryTime(Order order){
        LocalTime res=LocalTime.now();
        long location = (long)(getLocation(order.getCustomerLocation(), order.getRider().getRiderLocation())/15);
        return res.plusMinutes(location);
    }

}
