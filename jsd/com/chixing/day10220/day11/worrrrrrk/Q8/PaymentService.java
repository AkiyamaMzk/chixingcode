package chixing.day10220.day11.worrrrrrk.Q8;

public class PaymentService {
    public void doPayment(IPayment paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}
