package chixing.day10220.day19.work.Q1;

public class User {
    private String userId;
    private boolean isNewUser;
    private boolean isVIP;
    public User(String userId, boolean isNewUser, boolean isVIP) {
        this.userId = userId;
        this.isNewUser = isNewUser;
        this.isVIP = isVIP;
    }
    public String getUserId() {
        return userId;
    }
    public boolean isNewUser() {
        return isNewUser;
    }
    public boolean isVIP() {
        return isVIP;
    }
    
}
