package chixing.day10220.day20.hmwk.Q4;

import java.util.Set;

import chixing.day10220.day20.hmwk.Q4.Order.OrderStatus;

public class DispatchTask implements Runnable {
    private DispatchService dispatchService;

    public DispatchTask(DispatchService dispatchService) {
        this.dispatchService = dispatchService;
    }

    @Override
    public void run() {
        Order thisOrder = null;
        synchronized (dispatchService) {
            Set<Order> allOrder = dispatchService.getAllOrder();
            for (Order order : allOrder) {
                if (order.getOrderStatus() == OrderStatus.PENDING) {
                    dispatchService.dispatch(order);
                    thisOrder = order;
                    break;
                }
            }
        }
        try {
            // Thread.sleep(thisOrder.getExpectedDeliveryTime().until(LocalTime.now(),
            // ChronoUnit.SECONDS));
            Thread.sleep(2000);// 快速等待
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        dispatchService.finishDelivery(thisOrder.getRider(), thisOrder);
    }

}
