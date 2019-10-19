package jsonparser.mpmodel;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private int studentId;
    
    private Date studentActivationDate;
    private String studentAddress;
    private String studentCourseName;
    private String studentEmailId;
    //used for 
    private String studentField1;
    //used for 
    private String studentField2;
    //used for 
    private String studentField3;
    private int studentMachineCount;
    private String studentMachineText;
    private String studentMobileNo;
    private String studentName;
    private String studentOrderNo;
    
    private Date studentUpdateDate;
    private String studentPassword;
    private String studentLicenceStatus;
    private int studentActivationStatus;
    private boolean studentIsActive;

    public Student() {
    }

    public int getStudentId() {
        return this.studentId;
    }

    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Date getStudentActivationDate() {
        return this.studentActivationDate;
    }

    public void setStudentActivationDate(Date studentActivationDate) {
        this.studentActivationDate = studentActivationDate;
    }

    public String getStudentAddress() {
        return this.studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentCourseName() {
        return this.studentCourseName;
    }

    public void setStudentCourseName(String studentCourseName) {
        this.studentCourseName = studentCourseName;
    }

    public String getStudentEmailId() {
        return this.studentEmailId;
    }

    public void setStudentEmailId(String studentEmailId) {
        this.studentEmailId = studentEmailId;
    }

    public String getStudentField1() {
        return this.studentField1;
    }

    public void setStudentField1(String studentField1) {
        this.studentField1 = studentField1;
    }

    public String getStudentField2() {
        return this.studentField2;
    }

    public void setStudentField2(String studentField2) {
        this.studentField2 = studentField2;
    }

    public String getStudentField3() {
        return this.studentField3;
    }

    public void setStudentField3(String studentField3) {
        this.studentField3 = studentField3;
    }

    public int getStudentMachineCount() {
        return this.studentMachineCount;
    }

    public void setStudentMachineCount(int studentMachineCount) {
        this.studentMachineCount = studentMachineCount;
    }

    public String getStudentMachineText() {
        return this.studentMachineText;
    }

    public void setStudentMachineText(String studentMachineText) {
        this.studentMachineText = studentMachineText;
    }

    public String getStudentMobileNo() {
        return this.studentMobileNo;
    }

    public void setStudentMobileNo(String studentMobileNo) {
        this.studentMobileNo = studentMobileNo;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentOrderNo() {
        return this.studentOrderNo;
    }

    public void setStudentOrderNo(String studentOrderNo) {
        this.studentOrderNo = studentOrderNo;
    }

    public Date getStudentUpdateDate() {
        return this.studentUpdateDate;
    }

    public void setStudentUpdateDate(Date studentUpdateDate) {
        this.studentUpdateDate = studentUpdateDate;
    }

    /**
     * @return the studentPassword
     */
    public String getStudentPassword() {
        return studentPassword;
    }

    /**
     * @param studentPassword the studentPassword to set
     */
    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentLicenceStatus() {
        return studentLicenceStatus;
    }

    public void setStudentLicenceStatus(String studentLicenceStatus) {
        this.studentLicenceStatus = studentLicenceStatus;
    }

    public int getStudentActivationStatus() {
        return studentActivationStatus;
    }

    public void setStudentActivationStatus(int studentActivationStatus) {
        this.studentActivationStatus = studentActivationStatus;
    }

    /**
     * @return the studentIsActive
     */
    public boolean getStudentIsActive() {
        return studentIsActive;
    }

    /**
     * @param studentIsActive the studentIsActive to set
     */
    public void setStudentIsActive(boolean studentIsActive) {
        this.studentIsActive = studentIsActive;
    }

}
