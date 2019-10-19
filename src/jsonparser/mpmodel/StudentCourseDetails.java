package jsonparser.mpmodel;


import java.util.List;


public class StudentCourseDetails {

    private static final long serialVersionUID = 1L;
    public Student student;
    public List<Course> courseList;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

}
