package jsonparser.model;


import java.io.Serializable;



/**
 * The persistent class for the lecture database table.
 * 
 */

public class Lecture implements Serializable,Cloneable {
	private static final long serialVersionUID = 1L;

	
	private int lectureId;

	private int courseId;
	
	private String courseName;

	
	private Double lectureDuration;
	
	private String lectureName;

	private Double lecturePlayTimes;
	
	private String lectureRemainingTime="";
	
	private double studentLectureTotalTime;
	private double studentLectureRemainingTime;
	
	private int studentCourseId;
	
	private int renewalStatus;

	public Lecture() {
	}

//	public Lecture(int lectureId, int courseId, String courseName, String lectureDuration, String lectureField2,
//			String lectureField3, String lectureName, Double lecturePlayTimes, String lectureRemainingTime) {
//		super();
//		this.lectureId = lectureId;
//		this.courseId = courseId;
//		this.courseName = courseName;
//		this.lectureDuration = lectureDuration;
//		this.lectureName = lectureName;
//		this.lecturePlayTimes = lecturePlayTimes;
//		this.lectureRemainingTime = lectureRemainingTime;
//	}

	public int getLectureId() {
		return this.lectureId;
	}

	public void setLectureId(int lectureId) {
		this.lectureId = lectureId;
	}

	public int getCourseId() {
		return this.courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Double getLectureDuration() {
		return this.lectureDuration;
	}

	public void setLectureDuration(Double lectureField1) {
		this.lectureDuration = lectureField1;
	}

	public String getLectureName() {
		return this.lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public Double getLecturePlayTimes() {
		return this.lecturePlayTimes;
	}

	public void setLecturePlayTimes(Double lecturePlayTimes) {
		this.lecturePlayTimes = lecturePlayTimes;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the lectureRemainingTime
	 */
	public String getLectureRemainingTime() {
		return lectureRemainingTime;
	}

	/**
	 * @param lectureRemainingTime the lectureRemainingTime to set
	 */
	public void setLectureRemainingTime(String lectureRemainingTime) {
		this.lectureRemainingTime = lectureRemainingTime;
	}

	/**
	 * @return the studentLectureTotalTime
	 */
	public double getStudentLectureTotalTime() {
		return studentLectureTotalTime;
	}

	/**
	 * @param studentLectureTotalTime the studentLectureTotalTime to set
	 */
	public void setStudentLectureTotalTime(double studentLectureTotalTime) {
		this.studentLectureTotalTime = studentLectureTotalTime;
	}

	/**
	 * @return the studentLectureRemainingTime
	 */
	public double getStudentLectureRemainingTime() {
		return studentLectureRemainingTime;
	}

	/**
	 * @param studentLectureRemainingTime the studentLectureRemainingTime to set
	 */
	public void setStudentLectureRemainingTime(double studentLectureRemainingTime) {
		this.studentLectureRemainingTime = studentLectureRemainingTime;
	}

	/**
	 * @return the studentCourseId
	 */
	public int getStudentCourseId() {
		return studentCourseId;
	}

	/**
	 * @param studentCourseId the studentCourseId to set
	 */
	public void setStudentCourseId(int studentCourseId) {
		this.studentCourseId = studentCourseId;
	}

	public int getRenewalStatus() {
		return renewalStatus;
	}

	public void setRenewalStatus(int renewalStatus) {
		this.renewalStatus = renewalStatus;
	}

}