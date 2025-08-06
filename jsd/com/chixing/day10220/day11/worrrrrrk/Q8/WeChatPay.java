package chixing.day10220.day11.worrrrrrk.Q8;

public class WeChatPay implements IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("WeChatPay:"+amount);
    }
}
