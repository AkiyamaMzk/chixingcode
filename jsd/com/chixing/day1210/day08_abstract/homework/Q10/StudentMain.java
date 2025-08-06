package chixing.day1210.day08_abstract.homework.Q10;



public class StudentMain {
    public static void main(String[] args) {
        MyStudent[] students=new MyStudent[10];
        for(int i=0;i<10;i++){
            students[i]=new MyStudent("stuTest"+(i+1),i*10);
            System.out.println(students[i]);
        }
        System.out.println(MyStudent.getAverageScore());
    }
}
