package chixing.day10220.day20.hmwk.Q1;

public class OrderRecord {
    private Member member;
    private String HomeType;
    private int days;

    public String getHomeType() {
        return HomeType;
    }

    public int getDays() {
        return days;
    }

    public Member getMember() {
        return member;
    }

    public OrderRecord(Member member, String homeType, int days) {
        this.member = member;
        HomeType = homeType;
        this.days = days;
    }

}
