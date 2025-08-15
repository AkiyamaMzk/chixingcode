package chixing.day10220.day20.hmwk.Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MemberServiceImp implements MemberService {
    Set<Member> members = new TreeSet<>();

    @Override
    public void recordStay(OrderRecord record) {
        Member member = record.getMember();
        if (members.contains(member))
            members.remove(member);
        String type = record.getHomeType();
        int value = 0;
        switch (type) {
        case "普通房":
            value = 10;
            break;
        case "高级房":
            value = 20;
            break;
        case "超级房":
            value = 30;
            break;
        case "大师房":
            value = 40;
            break;
        default:
            break;
        }
        ;
        member.setSorce(member.getSorce() + value * record.getDays());
        members.add(member);
    }

    @Override
    public List<Member> getTopNMembers(int n) {
        if (n > members.size())
            n = members.size();
        return members.stream().limit(n).toList();// 转为list
    }

    @Override
    public Map<String, List<Member>> groupByLevel() {
        Map<String, List<Member>> res = new HashMap<>();
        res.put("黄铜会员", new ArrayList<>());
        res.put("白银会员", new ArrayList<>());
        res.put("黄金会员", new ArrayList<>());
        for (Member member : members) {
            if (member.getSorce() < 2000)
                res.get("黄铜会员").add(member);
            else if (member.getSorce() < 5000)
                res.get("白银会员").add(member);
            else
                res.get("黄金会员").add(member);
        }
        return res;
    }

}
