package chixing.day10220.day11;

public class Student {
    private int stuId;
    private String stuName;
    private int stuAge;
    private Course course;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Student studentClone=new Student();
        studentClone.stuId=this.stuId;
        studentClone.stuAge=this.stuAge;
        studentClone.stuName=this.stuName;
        studentClone.course=(Course)this.course.clone();
        return studentClone;
    }

    public Student() {
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student(int stuId, String stuName, int stuAge, Course course) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.course = course;
    }
}