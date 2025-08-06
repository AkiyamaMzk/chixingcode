package chixing.day1210.day10.workwork.Q19;

public class waterTest {
    public static void main(String[] args) {
        Water water1=WaterFactory.waterSupply("饮用水");
        water1.information();
        Water water2=WaterFactory.waterSupply("冲厕水");
        water2.information();
    }
}
