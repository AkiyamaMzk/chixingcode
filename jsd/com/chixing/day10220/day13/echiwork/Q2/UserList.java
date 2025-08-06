package chixing.day10220.day13.echiwork.Q2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UserList extends ArrayList<User>{
    private Set<String> userMail=new HashSet<>();

    public UserList(){
        
    }
    @Override
    public boolean add(User user){
        if(userMail.add(user.getUserMail())){
            super.add(user);
        }else{
            System.out.println("该邮箱已被注册");
            return false;
        }
        return true;
    }
}
