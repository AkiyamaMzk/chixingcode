package chixing.day10220.day11;

public class Course {
    private int courseId;
    private String courseName;
    private float courseScore;

    public Course(){}
    public Course(int courseId, String courseName, float courseScore) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseScore = courseScore;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course courseClone=new Course();
        courseClone.courseId=this.courseId;
        courseClone.courseName=this.courseName;
        courseClone.courseScore=this.courseScore;
        return courseClone;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public float getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(float courseScore) {
        this.courseScore = courseScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseScore=" + courseScore +
                '}';
    }
}
