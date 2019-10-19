package jsonparser.mpmodel;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the registration database table.
 * 
 */

public class Registration implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int registrationStudentId;

	private String registrationStudentAddress;

	private String registrationStudentCourseName;

	
	private String registrationStudentEmailId;

	
	private String registrationStudentMobileNo;

	private String registrationStudentName;

		
	private Date registrationDate;

	public Registration() {
	}

	public int getRegistrationStudentId() {
		return this.registrationStudentId;
	}

	public void setRegistrationStudentId(int registrationStudentId) {
		this.registrationStudentId = registrationStudentId;
	}

	

	public String getRegistrationStudentAddress() {
		return this.registrationStudentAddress;
	}

	public void setRegistrationStudentAddress(String registrationStudentAddress) {
		this.registrationStudentAddress = registrationStudentAddress;
	}

	public String getRegistrationStudentCourseName() {
		return this.registrationStudentCourseName;
	}

	public void setRegistrationStudentCourseName(String registrationStudentCourseName) {
		this.registrationStudentCourseName = registrationStudentCourseName;
	}

	public String getRegistrationStudentEmailId() {
		return this.registrationStudentEmailId;
	}

	public void setRegistrationStudentEmailId(String registrationStudentEmailId) {
		this.registrationStudentEmailId = registrationStudentEmailId;
	}


	public String getRegistrationStudentMobileNo() {
		return this.registrationStudentMobileNo;
	}

	public void setRegistrationStudentMobileNo(String registrationStudentMobileNo) {
		this.registrationStudentMobileNo = registrationStudentMobileNo;
	}

	public String getRegistrationStudentName() {
		return this.registrationStudentName;
	}

	public void setRegistrationStudentName(String registrationStudentName) {
		this.registrationStudentName = registrationStudentName;
	}

	

	public Date getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Date registrationStudentUpdateDate) {
		this.registrationDate = registrationStudentUpdateDate;
	}

}