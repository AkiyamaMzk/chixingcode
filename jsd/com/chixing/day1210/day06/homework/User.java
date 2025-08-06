package chixing.day1210.day06.homework;

public class User {
    private String userName;
    private int point;

    public void printUser() {
        System.out.print(userName + " " + point);
    }

    public User(String userName, int point) {
        this.userName = userName;
        this.point = point;
    }
}
