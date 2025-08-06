package chixing.day1210.day09_static_interface.interfaces;

public class SmsLogin implements LoginApi{
    @Override
    public void longin() {
        System.out.println("网络繁忙，请稍后重试");
    }

    @Override
    public void longout() {

    }
}
