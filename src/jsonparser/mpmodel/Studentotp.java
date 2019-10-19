package jsonparser.mpmodel;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the studentotp database table.
 * 
 */

public class Studentotp implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int studentOtpId;

	private int studentId;

	
	private Date studentOtpDate;

	
	private String studentOtpEmailId;

	
	private String studentOtpField1;

	
	private String studentOtpField2;

	
	private String studentOtpField3;

	private String studentOtpFlag;

	
	private String studentOtpFor;

	private String studentOtpMobileNo;

	private String studentOtpText;

	public Studentotp() {
	}

	public int getStudentOtpId() {
		return this.studentOtpId;
	}

	public void setStudentOtpId(int studentOtpId) {
		this.studentOtpId = studentOtpId;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Date getStudentOtpDate() {
		return this.studentOtpDate;
	}

	public void setStudentOtpDate(Date studentOtpDate) {
		this.studentOtpDate = studentOtpDate;
	}

	public String getStudentOtpEmailId() {
		return this.studentOtpEmailId;
	}

	public void setStudentOtpEmailId(String studentOtpEmailId) {
		this.studentOtpEmailId = studentOtpEmailId;
	}

	public String getStudentOtpField1() {
		return this.studentOtpField1;
	}

	public void setStudentOtpField1(String studentOtpField1) {
		this.studentOtpField1 = studentOtpField1;
	}

	public String getStudentOtpField2() {
		return this.studentOtpField2;
	}

	public void setStudentOtpField2(String studentOtpField2) {
		this.studentOtpField2 = studentOtpField2;
	}

	public String getStudentOtpField3() {
		return this.studentOtpField3;
	}

	public void setStudentOtpField3(String studentOtpField3) {
		this.studentOtpField3 = studentOtpField3;
	}

	public String getStudentOtpFlag() {
		return this.studentOtpFlag;
	}

	public void setStudentOtpFlag(String studentOtpFlag) {
		this.studentOtpFlag = studentOtpFlag;
	}

	public String getStudentOtpFor() {
		return this.studentOtpFor;
	}

	public void setStudentOtpFor(String studentOtpFor) {
		this.studentOtpFor = studentOtpFor;
	}

	public String getStudentOtpMobileNo() {
		return this.studentOtpMobileNo;
	}

	public void setStudentOtpMobileNo(String studentOtpMobileNo) {
		this.studentOtpMobileNo = studentOtpMobileNo;
	}

	public String getStudentOtpText() {
		return this.studentOtpText;
	}

	public void setStudentOtpText(String studentOtpText) {
		this.studentOtpText = studentOtpText;
	}

}