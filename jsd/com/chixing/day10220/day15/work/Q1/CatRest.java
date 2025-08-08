package chixing.day10220.day15.work.Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatRest {
    public static void main(String[] args) {
        Map<String, Integer> catList = new HashMap<>();
        {// 添加
            catList.put("特斯拉", 2000);
            catList.put("阿波罗EVO", 1);
            catList.put("迈巴赫", 1);
            catList.put("法拉利", 2);
            catList.put("理想", 1000);
            catList.put("乘风", 300);
            catList.put("丰田", 3000);
            catList.put("猫车", null);
        }
        System.out.println("总个数:" + catList.size());
        System.out.println("特斯拉:" + catList.get("特斯拉"));
        String maxKey = null;
        List<String> lowCat = new ArrayList<>();
        System.out.println("小于300销量:");
        for (Map.Entry<String, Integer> cat : catList.entrySet()) {
            if (cat.getValue() != null && (cat.getValue() < 300)) {
                lowCat.add(cat.getKey());
                System.out.println(lowCat.get(lowCat.size() - 1));
            }

            if (maxKey == null || (cat.getValue() != null && (cat.getValue() > catList.get(maxKey))))
                maxKey = cat.getKey();
        }
        System.out.println("最大销量:" + maxKey + "-" + catList.get(maxKey));
    }
}
