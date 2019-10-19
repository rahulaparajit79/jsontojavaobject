package jsonparser.model;


import java.util.Date;

public class StudentLogDetails {

    private int studentLogDetailId;
    private int studentId;
    private String courseName;
    private String lectureName;
    private String action;
    private String remainingTime;

    private Date dateTime;

    public int getStudentLogDetailId() {
        return studentLogDetailId;
    }

    public void setStudentLogDetailId(int studentLogDetailId) {
        this.studentLogDetailId = studentLogDetailId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

}
