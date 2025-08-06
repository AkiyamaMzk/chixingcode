package chixing.day1210.day06.homework;

public class Order {
    private int orderId;
    private double amount;
    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }
    public void printOrder(){
        System.out.print(orderId+" "+amount);
    }


}
