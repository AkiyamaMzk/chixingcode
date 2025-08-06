package chixing.day1210.day09_static_interface.interfaces.homework.Q7;

public abstract class User implements Authenticatable{
    private String userName;
    private String userPassword;
    protected boolean isLog=false;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
