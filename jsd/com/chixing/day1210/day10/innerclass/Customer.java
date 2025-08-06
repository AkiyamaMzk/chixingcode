package chixing.day1210.day10.innerclass;

public class Customer {
    private static int custId=1;
    static {
        System.out.println("Cust static");
    }
    private String custName;
    public CustomerAddress customerAddress;
    public class CustomerAddress{
        private String custProvince;
        private String custCity;
        private String custArea;
        private String custStreet;
        private String custDeatailAddress;
        static {
            int test=custId;
            System.out.println("add static");
        }



    }
    public void shopping(){}
}
