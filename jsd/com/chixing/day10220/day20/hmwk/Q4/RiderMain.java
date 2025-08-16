package chixing.day10220.day20.hmwk.Q4;

import chixing.day10220.day20.hmwk.Q4.Order.OrderStatus;

public class RiderMain {
    public static void main(String[] args) {
        RiderProxy proxy = new RiderProxy(new DispatchServiceImp());
        DispatchService dispatchService = (DispatchService) proxy.CreateProxy();
        Rider rider1 = new Rider("001", "电脑玩家dewasu", new int[] { 100, 200 }, 10);
        Rider rider2 = new Rider("002", "电脑玩家people", new int[] { 300, 200 }, 10);
        Rider rider3 = new Rider("003", "电脑玩家fywoo", new int[] { 200, 600 }, 10);
        Rider rider4 = new Rider("004", "电脑玩家ponk", new int[] { 600, 600 }, 10);
        // Rider rider5 = new Rider("hide", "电脑玩家monkey", null, 0);
        Order order1 = new Order("001", new int[] { 100, 200 }, 500, Order.OrderPriority.HIGH, OrderStatus.PENDING);
        Order order2 = new Order("002", new int[] { 700, 200 }, 100, Order.OrderPriority.MID, OrderStatus.PENDING);
        Order order3 = new Order("003", new int[] { 200, 200 }, 200, Order.OrderPriority.LOW, OrderStatus.PENDING);
        dispatchService.addOrder(order3);
        dispatchService.addOrder(order2);
        dispatchService.addOrder(order1);
        dispatchService.addRider(rider4);
        dispatchService.addRider(rider3);
        dispatchService.addRider(rider2);
        dispatchService.addRider(rider1);
        Thread t1 = new Thread(new DispatchTask(dispatchService));
        Thread t2 = new Thread(new DispatchTask(dispatchService));
        Thread t3 = new Thread(new DispatchTask(dispatchService));
        t1.start();// 每个线程一单
        t2.start();
        t3.start();

    }

}
