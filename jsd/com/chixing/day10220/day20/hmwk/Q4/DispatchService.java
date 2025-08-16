package chixing.day10220.day20.hmwk.Q4;

import java.util.List;
import java.util.Set;

public interface DispatchService {

    void addOrder(Order order);

    Rider dispatch(Order order);

    void finishDelivery(Rider rider, Order order);

    List<Order> getOrdersByRider(Rider rider);

    List<Rider> getAvailableRiders();

    void addRider(Rider rider);

    Set<Order> getAllOrder();
}
