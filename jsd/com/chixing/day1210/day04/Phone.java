package chixing.day1210.day04;

public class Phone {

    int PhoneNumber;
    //构造函数 constructor
    public Phone(int n){
        PhoneNumber=n;
    }
    public Phone(){
        System.out.println(1);
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
