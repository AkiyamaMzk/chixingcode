package chixing.day1210.day06.homework;

public class OnlineOrder extends Order{
    private String email;

    public OnlineOrder(int orderId, double amount, String email) {
        super(orderId, amount);
        this.email = email;
    }
    public void printOnlineOrder(){
        printOrder();
        System.out.print(" "+email);
    }

}
