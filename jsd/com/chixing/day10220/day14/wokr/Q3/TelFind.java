package chixing.day10220.day14.wokr.Q3;

import java.util.HashMap;
import java.util.Map;

public class TelFind {
    static Map<String, Long> phoneBook = new HashMap<>();

    public static void main(String[] args) {

        phoneBook.put("Tom", 18627395555L);
        phoneBook.put("Jerry", 1923833333L);
        phoneBook.put("Alice", 13789439999L);
        System.out.println(getPhoneNo("Tom"));

    }

    public static Long getPhoneNo(String userName) {
        return phoneBook.get(userName);
    }

}
