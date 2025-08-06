package chixing.day10220.day13.echiwork.Q2;

public class User {
    private String userName;
    private String userMail;

    public User(String userName, String userMail) {
        this.userName = userName;
        this.userMail = userMail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserMail() {
        return userMail;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", userMail=" + userMail + "]";
    }

}
