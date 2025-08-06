package chixing.day10220.day12.hwork.Q7;

import java.util.ArrayList;
import java.util.List;

public class AddressTest {
    public static void main(String[] args) {
        List<MailAddress> mailAddressList=new ArrayList<>();
        mailAddressList.add(new MailAddress("name1","123456","street","city","state","country","123456"));
        mailAddressList.add(new MailAddress("name2","123456","street","city","state","country","123456"));
        mailAddressList.add(new MailAddress("name3","123456","street","city","state","country","123456"));
        mailAddressList.forEach(System.out::println);
    }
}
