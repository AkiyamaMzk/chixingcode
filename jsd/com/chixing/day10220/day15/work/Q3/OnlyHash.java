package chixing.day10220.day15.work.Q3;

import java.util.HashMap;
import java.util.Map;

public class OnlyHash {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("b", 3);
        map2.put("c", 4);

        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("a", 5);
        map3.put("c", 1);

        HashMap<String, Integer> map4 = hashMerge(map1, map2, map3);
        System.out.println(map4);

    }

    public static HashMap<String, Integer> hashMerge(HashMap<String, Integer>... maps) {
        HashMap<String, Integer> onlyHash = new HashMap<>();
        for (HashMap<String, Integer> hashMap : maps) {
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                onlyHash.put(entry.getKey(), onlyHash.get(entry.getKey()) == null ? entry.getValue()
                        : Math.max(entry.getValue(), onlyHash.get(entry.getKey())));
            }
        }
        return onlyHash;
    }
}
