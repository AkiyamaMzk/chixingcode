package chixing.day10220.day15.work.Q2;

import java.util.HashMap;
import java.util.Map;

public class WorldIsMost {

    public static void main(String[] args) {
        System.out.println("max:" + mostFrequentWord("Isekai Radio Planet FM Yokohama 84.7 Dj Isekai Joucho"));
    }

    public static String mostFrequentWord(String sentence) {
        String max = null;
        Map<String, Integer> sMap = new HashMap<>();
        for (String eachString : sentence.split(" ")) {
            sMap.put(eachString, sMap.getOrDefault(eachString, 0) + 1);
        }
        for (Map.Entry<String, Integer> sEntry : sMap.entrySet()) {
            System.out.println(sEntry.getKey() + ":" + sEntry.getValue());
            if (max == null || sEntry.getValue() > sMap.get(max))
                max = sEntry.getKey();
        }
        return max;
    }

}
