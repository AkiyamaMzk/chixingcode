package chixing.day10220.day15.work.Q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneList {
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        {// 添加
            phoneList.add(new Phone("苹果", "iphone 15", 1999));
            phoneList.add(new Phone("小米", "Redmi K70", 3999));
            phoneList.add(new Phone("华为", "华为nova 11SE", 3999));
            phoneList.add(new Phone("华为", "华为70 Pro", 2999));
            phoneList.add(new Phone("OPPO", "OPPO K12x", 4999));
            phoneList.add(new Phone("苹果", "iphone 14", 6999));
            phoneList.add(new Phone("小米", "Redmi Note13", 1000));
            phoneList.add(new Phone("OPPO", "OPPO A1i", 1999));
            phoneList.add(new Phone("苹果", "iphone 13", 2999));
            phoneList.add(new Phone("华为", "华为mate60", 2999));
            phoneList.add(new Phone("华为", "华为nova12", 2999));
            phoneList.add(new Phone("小米", "小米 12C", 2888));
            phoneList.add(new Phone("苹果", "iphone 12", 1777));
        }
        Map<String, List<Phone>> phoneMap = new HashMap<>();
        for (Phone phone : phoneList) {
            if (!phoneMap.containsKey(phone.getBrand()))
                phoneMap.put(phone.getBrand(), new ArrayList<>());
            phoneMap.get(phone.getBrand()).add(phone);
        }
        for (Map.Entry<String, List<Phone>> entry : phoneMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        




    }
}
