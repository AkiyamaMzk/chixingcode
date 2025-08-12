package chixing.dayNull;

import java.util.Comparator;

public class SimpleStudent implements Comparable{
    private String StudnetId;
    private String StudentName;

    public SimpleStudent(String studnetId, String studentName) {
        StudnetId = studnetId;
        StudentName = studentName;
    }

    public SimpleStudent() {
    }

    public String getStudnetId() {
        return StudnetId;
    }

    public void setStudnetId(String studnetId) {
        StudnetId = studnetId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((StudnetId == null) ? 0 : StudnetId.hashCode());
        result = prime * result + ((StudentName == null) ? 0 : StudentName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SimpleStudent other = (SimpleStudent) obj;
        if (StudnetId == null) {
            if (other.StudnetId != null)
                return false;
        } else if (!StudnetId.equals(other.StudnetId))
            return false;
        if (StudentName == null) {
            if (other.StudentName != null)
                return false;
        } else if (!StudentName.equals(other.StudentName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "StudnetId=" + StudnetId + ", StudentName=" + StudentName;
    }

    @Override
    public int compareTo(Object o) {
        SimpleStudent that=(SimpleStudent) o;
        return Comparator
                .comparing(SimpleStudent::getStudentName)
                .thenComparing(SimpleStudent::getStudnetId)
                .compare(this,that);
    }

}
