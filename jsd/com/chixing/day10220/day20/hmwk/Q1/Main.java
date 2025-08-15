package chixing.day10220.day20.hmwk.Q1;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("001", "樱羽艾玛", 0);
        Member member2 = new Member("002", "二阶堂希罗", 0);
        Member member3 = new Member("003", "冰上梅露露", 2000);
        Member member4 = new Member("004", "橘雪莉", 0);
        Member member5 = new Member("005", "月代雪", 99999);
        OrderRecord record1 = new OrderRecord(member5, "大师房", 99999);
        OrderRecord record2 = new OrderRecord(member4, "普通房", 60);
        OrderRecord record3 = new OrderRecord(member3, "高级房", 720);
        OrderRecord record4 = new OrderRecord(member2, "普通房", 1);
        OrderRecord record5 = new OrderRecord(member1, "普通房", 80);

        OrderProxy OP = new OrderProxy(new MemberServiceImp());
        MemberService proxy = (MemberService) OP.CreateProxy();
        proxy.recordStay(record1);
        proxy.recordStay(record2);
        proxy.recordStay(record3);
        proxy.recordStay(record4);
        proxy.recordStay(record5);
        List<Member> topNMembers = proxy.getTopNMembers(3);
        Map<String, List<Member>> groupLevel = proxy.groupByLevel();
        System.out.println("积分最高会员：");
        for (int i = 0; i < topNMembers.size(); i++) {
            System.out.println("第" + (i + 1) + "位：" + topNMembers.get(i).getMemberName()+":"+topNMembers.get(i).getSorce());
        }
        for (Map.Entry<String, List<Member>> entry : groupLevel.entrySet()) {
            System.out.println(entry.getKey());
            for (Member member : entry.getValue()) {
                System.out.println(member.getMemberName());
            }
        }
    }
}
