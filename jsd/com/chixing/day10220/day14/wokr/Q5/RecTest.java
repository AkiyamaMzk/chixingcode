package chixing.day10220.day14.wokr.Q5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RecTest {
    public static void main(String[] args) {
        List<BrowseRecord> browseRecords = new ArrayList<>();
        {// 添加数据
            BrowseRecord r1 = new BrowseRecord(101, "浏览商品");
            BrowseRecord r2 = new BrowseRecord(101, "搜索关键字");
            BrowseRecord r3 = new BrowseRecord(101, "添加购物车");
            BrowseRecord r4 = new BrowseRecord(102, "浏览商品");
            BrowseRecord r5 = new BrowseRecord(102, "点赞操作");
            BrowseRecord r6 = new BrowseRecord(102, "收藏操作");
            BrowseRecord r7 = new BrowseRecord(103, "浏览商品");
            BrowseRecord r8 = new BrowseRecord(103, "添加购物车");
            BrowseRecord r9 = new BrowseRecord(101, "浏览商品"); // 表示101用户在另一个时间点 又有浏览商品操作
            browseRecords.add(r1);
            browseRecords.add(r2);
            browseRecords.add(r3);
            browseRecords.add(r4);
            browseRecords.add(r5);
            browseRecords.add(r6);
            browseRecords.add(r7);
            browseRecords.add(r8);
            browseRecords.add(r9);
        }
        Map<String, Set<String>> recCount = new HashMap<>();

        // List<String> user01 = browseRecords.stream().filter(record -> record.getUserId() == 101)
        //         .map(BrowseRecord::getActionType).collect(Collectors.toList());

        for (BrowseRecord browseRecord : browseRecords) {
        String userId = String.valueOf(browseRecord.getUserId()) ;
        String actionType = browseRecord.getActionType();
        if(!recCount.containsKey(userId)){
        recCount.put(userId,new HashSet<>());
        }
        recCount.get(userId).add(actionType);
        }

        for (Map.Entry<String, Set<String>> entry : recCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
