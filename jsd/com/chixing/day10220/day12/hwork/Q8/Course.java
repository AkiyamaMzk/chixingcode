package chixing.day10220.day12.hwork.Q8;

public class Course {
    private String courseNo;
    private String courseName;
    private int courseCredit;

    public Course(String courseNo, String courseName, int courseCredit) {
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.courseCredit = courseCredit;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public int getCourseCredit() {
        return courseCredit;
    }
}
