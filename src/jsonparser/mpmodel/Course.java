package jsonparser.mpmodel;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the course database table.
 *
 */

public class Course implements Serializable {

    /**
     * @return the studentCourseValidUpto
     */
    public Date getStudentCourseValidUpto() {
        return studentCourseValidUpto;
    }

    /**
     * @param studentCourseValidUpto the studentCourseValidUpto to set
     */
    public void setStudentCourseValidUpto(Date studentCourseValidUpto) {
        this.studentCourseValidUpto = studentCourseValidUpto;
    }

    private static final long serialVersionUID = 1L;

    private int courseId;

    private int courseBookMark;

    private String courseCode;

    private int courseExternalMassStorage;

    private int courseFastForward;

    private String courseField1;

    private String courseField2;

    private String courseField3;

    private int courseFullScreen;

    private int courseKeyboardBloack;

    private int courseLaptopOnly;

    private String courseLectureLocation;

    private int courseLectureLog;

    private String courseName;

    private String coursePassword;

    private int courseSecondDisplay;

    private int courseTotalLicense;

    private String courseUserName;

    private int courseValidityDays;

    private int courseVirtualMachine;

    private int courseWatermark;

    private int featureId;
    private int studentCourseId;
   
    private Date courseStartDate;
    
    private Date courseValidUpto;
    private String courseForStudent;
    private String courseForFranchise;
    private String courseForStudentFranchise;
    private int courseWebcam;
    private int courseSafenetEncryption;
    
    private Date studentCourseValidUpto;
    private boolean isCourseActive;

    private List<Lecture> lectureList;

    public int getStudentCourseId() {
        return studentCourseId;
    }

    public void setStudentCourseId(int studentCourseId) {
        this.studentCourseId = studentCourseId;
    }

    public Course() {
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseBookMark() {
        return this.courseBookMark;
    }

    public void setCourseBookMark(int courseBookMark) {
        this.courseBookMark = courseBookMark;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCourseExternalMassStorage() {
        return this.courseExternalMassStorage;
    }

    public void setCourseExternalMassStorage(int courseExternalMassStorage) {
        this.courseExternalMassStorage = courseExternalMassStorage;
    }

    public int getCourseFastForward() {
        return this.courseFastForward;
    }

    public void setCourseFastForward(int courseFastForward) {
        this.courseFastForward = courseFastForward;
    }

    public String getCourseField1() {
        return this.courseField1;
    }

    public void setCourseField1(String courseField1) {
        this.courseField1 = courseField1;
    }

    public String getCourseField2() {
        return this.courseField2;
    }

    public void setCourseField2(String courseField2) {
        this.courseField2 = courseField2;
    }

    public String getCourseField3() {
        return this.courseField3;
    }

    public void setCourseField3(String courseField3) {
        this.courseField3 = courseField3;
    }

    public int getCourseFullScreen() {
        return this.courseFullScreen;
    }

    public void setCourseFullScreen(int courseFullScreen) {
        this.courseFullScreen = courseFullScreen;
    }

    public int getCourseKeyboardBloack() {
        return this.courseKeyboardBloack;
    }

    public void setCourseKeyboardBloack(int courseKeyboardBloack) {
        this.courseKeyboardBloack = courseKeyboardBloack;
    }

    public int getCourseLaptopOnly() {
        return this.courseLaptopOnly;
    }

    public void setCourseLaptopOnly(int courseLaptopOnly) {
        this.courseLaptopOnly = courseLaptopOnly;
    }

    public String getCourseLectureLocation() {
        return this.courseLectureLocation;
    }

    public void setCourseLectureLocation(String courseLectureLocation) {
        this.courseLectureLocation = courseLectureLocation;
    }

    public int getCourseLectureLog() {
        return this.courseLectureLog;
    }

    public void setCourseLectureLog(int courseLectureLog) {
        this.courseLectureLog = courseLectureLog;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePassword() {
        return this.coursePassword;
    }

    public void setCoursePassword(String coursePassword) {
        this.coursePassword = coursePassword;
    }

    public int getCourseSecondDisplay() {
        return this.courseSecondDisplay;
    }

    public void setCourseSecondDisplay(int courseSecondDisplay) {
        this.courseSecondDisplay = courseSecondDisplay;
    }

    public int getCourseTotalLicense() {
        return this.courseTotalLicense;
    }

    public void setCourseTotalLicense(int courseTotalLicense) {
        this.courseTotalLicense = courseTotalLicense;
    }

    public String getCourseUserName() {
        return this.courseUserName;
    }

    public void setCourseUserName(String courseUserName) {
        this.courseUserName = courseUserName;
    }

    public int getCourseValidityDays() {
        return this.courseValidityDays;
    }

    public void setCourseValidityDays(int courseValidityDays) {
        this.courseValidityDays = courseValidityDays;
    }

    public int getCourseVirtualMachine() {
        return this.courseVirtualMachine;
    }

    public void setCourseVirtualMachine(int courseVirtualMachine) {
        this.courseVirtualMachine = courseVirtualMachine;
    }

    public int getCourseWatermark() {
        return this.courseWatermark;
    }

    public void setCourseWatermark(int courseWatermark) {
        this.courseWatermark = courseWatermark;
    }

    public int getFeatureId() {
        return this.featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    /**
     * @return the courseStartDate
     */
    public Date getCourseStartDate() {
        return courseStartDate;
    }

    /**
     * @param courseStartDate the courseStartDate to set
     */
    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    /**
     * @return the courseValidUpto
     */
    public Date getCourseValidUpto() {
        return courseValidUpto;
    }

    /**
     * @param courseValidUpto the courseValidUpto to set
     */
    public void setCourseValidUpto(Date courseValidUpto) {
        this.courseValidUpto = courseValidUpto;
    }

    public void setCourseForStudent(String string) {

    }

    /**
     * @return the courseForStudent
     */
    public String getCourseForStudent() {
        return courseForStudent;
    }

    /**
     * @return the courseForFranchise
     */
    public String getCourseForFranchise() {
        return courseForFranchise;
    }

    /**
     * @param courseForFranchise the courseForFranchise to set
     */
    public void setCourseForFranchise(String courseForFranchise) {
        this.courseForFranchise = courseForFranchise;
    }

    /**
     * @return the courseForStudentFranchise
     */
    public String getCourseForStudentFranchise() {
        return courseForStudentFranchise;
    }

    /**
     * @param courseForStudentFranchise the courseForStudentFranchise to set
     */
    public void setCourseForStudentFranchise(String courseForStudentFranchise) {
        this.courseForStudentFranchise = courseForStudentFranchise;
    }

    /**
     * @return the courseWebcam
     */
    public int getCourseWebcam() {
        return courseWebcam;
    }

    /**
     * @param courseWebcam the courseWebcam to set
     */
    public void setCourseWebcam(int courseWebcam) {
        this.courseWebcam = courseWebcam;
    }

    /**
     * @return the courseSafenetEncryption
     */
    public int getCourseSafenetEncryption() {
        return courseSafenetEncryption;
    }

    /**
     * @param courseSafenetEncryption the courseSafenetEncryption to set
     */
    public void setCourseSafenetEncryption(int courseSafenetEncryption) {
        this.courseSafenetEncryption = courseSafenetEncryption;
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
     * @return the isCourseActive
     */
    public boolean isIsCourseActive() {
        return isCourseActive;
    }

    /**
     * @param isCourseActive the isCourseActive to set
     */
    public void setIsCourseActive(boolean isCourseActive) {
        this.isCourseActive = isCourseActive;
    }

}
