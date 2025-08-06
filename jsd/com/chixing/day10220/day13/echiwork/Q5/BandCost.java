package chixing.day10220.day13.echiwork.Q5;

import java.util.HashMap;
import java.util.Map;

public class BandCost {
    public static void main(String[] args) {
        // 各省份的GDP
        // Map<Key,Value> 键值对， key 不能重复
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("宝洁", 35538);
        map1.put("洁宝", 47536);
        map1.put("联合利华", 50625);
        map1.put("华联合利", 53926);
        map1.put("利华联合", 90100);
        map1.put("合利华联", 137008);
        map1.put("利合联华", null);
        map1.put("华利合联", 80000);
        map1.put(null, null);

        System.out.println(map1); // 看结果， key 不能重复

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String brand = entry.getKey();
            Integer cost = entry.getValue();
            if (cost != null) {
                System.out.println(brand + " : " + cost);
            }
        }

    }
}
