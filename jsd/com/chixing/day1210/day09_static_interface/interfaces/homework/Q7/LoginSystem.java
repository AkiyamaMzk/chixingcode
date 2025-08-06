package chixing.day1210.day09_static_interface.interfaces.homework.Q7;

public final class LoginSystem {
    public static boolean validate(User user){
        if(user.isLog) {
            System.out.println(user.getUserName() + "登陆成功！");
            return true;
        }
            System.out.println(user.getUserName()+"登陆失败！");
        return false;
    }
}
