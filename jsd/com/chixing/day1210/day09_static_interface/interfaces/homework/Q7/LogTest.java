package chixing.day1210.day09_static_interface.interfaces.homework.Q7;

public class LogTest {

    public static void main(String[] args) {
        User admin=new AdminUser("管理员","123456","admin123456");
        User[] users=new User[5];
        for(int i=0;i<5;i++){
            users[i]=new NormalUser("用户"+(i+1),"123456");
        }
        admin.login("1","123456");
        LoginSystem.validate(admin);
        ((AdminUser)admin).login("管理员","123456","admin123456");
        LoginSystem.validate(admin);
        users[0].login("用户1","123456");
        LoginSystem.validate(users[0]);
        users[1].login("用户2","123");
        LoginSystem.validate(users[1]);

    }
}
