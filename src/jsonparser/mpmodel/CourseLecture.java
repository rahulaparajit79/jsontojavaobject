package jsonparser.mpmodel;

import java.util.List;

public class CourseLecture {

	private List <Course> courseList;
	private List<Lecture> lectureList;
	private Student student;
	
	/**
	 * @return the courseList
	 */
	public List<Course> getCourseList() {
		return courseList;
	}
	/**
	 * @param courseList the courseList to set
	 */
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	/**
	 * @return the lectureList
	 */
	public List<Lecture> getLectureList() {
		return lectureList;
	}
	/**
	 * @param lectureList the lectureList to set
	 */
	public void setLectureList(List<Lecture> lectureList) {
		this.lectureList = lectureList;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
