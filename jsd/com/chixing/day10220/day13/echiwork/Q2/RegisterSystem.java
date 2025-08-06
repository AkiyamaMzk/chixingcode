package chixing.day10220.day13.echiwork.Q2;

import java.util.ArrayList;

public class RegisterSystem {
    public static void main(String[] args) {
        ArrayList<User> userList = new UserList();
        userList.add(new User("Kaf", "Kaf@mail.com"));
        userList.add(new User("Isekaijoucho", "Isekaijoucho@mail.com"));
        userList.add(new User("Rime", "Rime@mail.com"));
        userList.add(new User("Kaf", "Kaf@mail.com"));
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
