package chixing.day1210.day10.workwork.Q17_old;

public class OrderTest {
    public static void main(String[] args) {
        Order personalOrder = new PersonalOrder(1000);
        Order enterpriseOrder = new EnterpriseOrder(5000000);
        System.out.println(personalOrder);
        System.out.println(enterpriseOrder);

    }
}
