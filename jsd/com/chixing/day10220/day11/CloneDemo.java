package chixing.day10220.day11;

public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        // 浅克隆
        Book book1 = new Book("java程序设计",99);
        Object clone = book1.clone();
        System.out.println(clone.hashCode()+"\n"+book1.hashCode());
        // deep clone
        Course course1 = new Course(701,"近代文学",3);
        Student student1 = new Student(801,"Allen",20,course1);
        Student student2=(Student) student1.clone();
        System.out.println(student1.clone()+"\n"+student2+"\n"+student1);
    }


}
