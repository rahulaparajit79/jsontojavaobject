package jsonparser.mpmodel;

public class StudentLecture {

	private int studentLectureId;
	private int studentId;
	private int lectureId;
	private int courseId;
	private double studentLectureTotalTime;
	private double studentLectureRemainingTime;

	/**
	 * @return the studentLectureId
	 */
	public int getStudentLectureId() {
		return studentLectureId;
	}

	/**
	 * @param studentLectureId
	 *            the studentLectureId to set
	 */
	public void setStudentLectureId(int studentLectureId) {
		this.studentLectureId = studentLectureId;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 *            the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the lectureId
	 */
	public int getLectureId() {
		return lectureId;
	}

	/**
	 * @param lectureId
	 *            the lectureId to set
	 */
	public void setLectureId(int lectureId) {
		this.lectureId = lectureId;
	}

	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId
	 *            the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the studentLectureTotalTime
	 */
	public double getStudentLectureTotalTime() {
		return studentLectureTotalTime;
	}

	/**
	 * @param studentLectureTotalTime
	 *            the studentLectureTotalTime to set
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
	 * @param studentLectureRemainingTime
	 *            the studentLectureRemainingTime to set
	 */
	public void setStudentLectureRemainingTime(double studentLectureRemainingTime) {
		this.studentLectureRemainingTime = studentLectureRemainingTime;
	}

}
