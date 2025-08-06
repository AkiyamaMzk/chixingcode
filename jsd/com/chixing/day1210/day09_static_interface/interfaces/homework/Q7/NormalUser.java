package chixing.day1210.day09_static_interface.interfaces.homework.Q7;

public class NormalUser extends User implements Authenticatable{


    public NormalUser(String userName, String userPassword) {
        super(userName, userPassword);
    }

    @Override
    public boolean login(String username, String password) {
        return this.isLog= this.getUserName().equals(username)
                &&this.getUserPassword().equals(password);
    }

}
