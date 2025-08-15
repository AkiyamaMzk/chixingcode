package chixing.day10220.day20.hmwk.Q1;

import java.util.List;
import java.util.Map;

public interface MemberService {
    public void recordStay(OrderRecord record);

    public List<Member> getTopNMembers(int n);

    public Map<String, List<Member>> groupByLevel();
}
