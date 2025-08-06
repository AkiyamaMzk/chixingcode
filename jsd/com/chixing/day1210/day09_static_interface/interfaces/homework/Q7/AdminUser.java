package chixing.day1210.day09_static_interface.interfaces.homework.Q7;

public class AdminUser extends User implements Authenticatable{
    private String adminCode;

    public AdminUser(String userName, String userPassword, String adminCode) {
        super(userName, userPassword);
        this.adminCode = adminCode;
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }
    public boolean login(String username, String password,String adminCode){
        return this.isLog= this.getUserName().equals(username)
                &&this.getUserPassword().equals(password)
                &&this.adminCode.equals(adminCode);
    }
}
