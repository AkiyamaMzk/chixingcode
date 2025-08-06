package chixing.day1210.day10.workwork.Q19;

public class WaterFactory {
    public static Water waterSupply(String type){
        if(type.equals("饮用水"))
            return new DrinkingWater();
        if(type.equals("冲厕水"))
            return new FlushWater();
        System.out.println("暂无该种类");
        return null;
    }
}
