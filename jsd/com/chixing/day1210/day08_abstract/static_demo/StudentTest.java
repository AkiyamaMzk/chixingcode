package chixing.day1210.day08_abstract.static_demo;

import java.lang.reflect.Array;

public class StudentTest {
    public static void main(String[] args) throws ClassNotFoundException {//抛出异常（？）-2025/7/30
        //JVM加载Student类
        //Class.forName("chixing.day08_abstract.static_demo.Student");
        //Student student = new Student();
        ExampleClass example=new ExampleClass();
        Array a=null;
        System.out.println(Mystudent.INT);

//        Student student = new Student();
//        Student student2= new Student();
//        Student student3= new Student();
//        System.out.println(student.schoolName);
//        System.out.println(student2.schoolName);
//        System.out.println(student3.schoolName);
//
//        Student.schoolName = "新东方";
//        System.out.println(student.schoolName);
//        System.out.println(student2.schoolName);
//        System.out.println(student3.schoolName);
//
//

    }


}
