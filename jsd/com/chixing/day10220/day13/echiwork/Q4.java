package chixing.day10220.day13.echiwork;

import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) {
        // 各省份的GDP
        // Map<Key,Value> 键值对， key 不能重复
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("陕西", 35538);
        map1.put("河北", 47536);
        map1.put("安徽", 50625);
        map1.put("上海", 53926);
        map1.put("浙江", 90100);
        map1.put("江苏", 137008);
        map1.put("北京", null);
        map1.put("上海", 80000);
        map1.put(null, null);

        System.out.println(map1); // 看结果， key 不能重复

        // 1. 获得 上海的GDP值
        System.out.println(map1.get("上海"));
        // 2. 获得映射map中键值对的个数
        System.out.println(map1.size());
        // 3. 删除key为北京的这条记录
        map1.remove("北京");
        // 4. 将key为陕西的GDP值 改成 36000 
        map1.put("陕西", 36000);
        // 5. 获得该映射map中所有的省份名称，并遍历输出
        map1.keySet().forEach(System.out::println); 
        // 6. 获得该映射map中所有的GDP的值，，并遍历输出
        map1.values().forEach(System.out::println);
        // 7. 是否包含key为黑龙江的这条记录
        System.out.println(map1.containsKey("黑龙江"));
        // 8. 是否包含value为80000 的这记录
        System.out.println(map1.containsValue(80000));
    }
}
