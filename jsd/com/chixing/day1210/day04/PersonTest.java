package chixing.day1210.day04;

public class PersonTest {


    public static void main(String[] args) {
        Person person1=new Person();
        Person person2=new Person();
        person1.setPersonAge(25);
        person1.setPersonName("张三");
        person1.setPersonSex("男");
        person1.setPersonMarried(false);
        person2.setPersonAge(25);
        person2.setPersonName("李四");
        person2.setPersonSex("女");
        person2.setPersonMarried(false);
        if (Person.marry(person1,person2)){
            System.out.println("可以结婚");
        }
        else
            System.out.println("不可以结婚");
    }
}
