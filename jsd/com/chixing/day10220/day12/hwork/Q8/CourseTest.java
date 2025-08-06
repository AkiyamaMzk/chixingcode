package chixing.day10220.day12.hwork.Q8;

import java.util.ArrayList;
import java.util.List;

public class CourseTest {
    public static void main(String[] args) {
        List<Course> courseList=new ArrayList<>();
        courseList.add(new Course("001","数据库原理",2));
        courseList.add(new Course("002","课程2",2));
        courseList.add(new Course("003","课程3",3));
        Course dataStructure=new Course("004","数据结构",2);
        for(int i=0;i<courseList.size();i++) {
            if(courseList.get(i).getCourseName().equals("数据库原理"))
                courseList.set(i,dataStructure);
        }
        int index=0;
        for (int i = 1; i <courseList.size() ; i++) {
            if(courseList.get(index).getCourseCredit()>courseList.get(i).getCourseCredit()) index=i;
        }
        courseList.remove(index);
    }
}
