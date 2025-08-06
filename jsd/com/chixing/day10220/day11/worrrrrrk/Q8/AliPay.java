package chixing.day10220.day11.worrrrrrk.Q8;

public class AliPay implements IPayment{
    private AliPay aliPay=new AliPay();
    private AliPay(){}
    public AliPay getInstance(){
        return aliPay;
    }
    @Override
    public void pay(double amount) {
        System.out.println("AliPay:"+amount);
    }
}
