package chixing.day10220.day20.hmwk.Q1;

public class Member implements Comparable<Member>{
    private String MemberId;
    private String MemberName;
    private int sorce;
    public String getMemberId() {
        return MemberId;
    }
    public String getMemberName() {
        return MemberName;
    }
    public int getSorce() {
        return sorce;
    }
    public Member(String memberId, String memberName, int sorce) {
        MemberId = memberId;
        MemberName = memberName;
        this.sorce = sorce;
    }
    public void setSorce(int sorce) {
        this.sorce = sorce;
    }
    @Override
    public int compareTo(Member o) {
        return Integer.compare(o.getSorce(),this.sorce);
    }
    
    

}
