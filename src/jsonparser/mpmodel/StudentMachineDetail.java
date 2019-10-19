package jsonparser.mpmodel;

public class StudentMachineDetail {

	private int studentMachineDetailId;
	private int studentId;
	private String studentMobileNo;
	private String machineText;
	private int loggedInMachine;
	private String licenseStatus;
	private String licenseC2V;
	private String licenseV2C;
	private String fingerprintStatus;
	private String fingerprintC2V;
	private String fingerprintV2C;
	
	public String getFingerprintStatus() {
		return fingerprintStatus;
	}
	public void setFingerprintStatus(String fingerprintStatus) {
		this.fingerprintStatus = fingerprintStatus;
	}
	public String getFingerprintC2V() {
		return fingerprintC2V;
	}
	public void setFingerprintC2V(String fingerprintC2V) {
		this.fingerprintC2V = fingerprintC2V;
	}
	public String getFingerprintV2C() {
		return fingerprintV2C;
	}
	public void setFingerprintV2C(String fingerprintV2C) {
		this.fingerprintV2C = fingerprintV2C;
	}
	public int getStudentMachineDetailId() {
		return studentMachineDetailId;
	}
	public void setStudentMachineDetailId(int studentMachineDetailId) {
		this.studentMachineDetailId = studentMachineDetailId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentMobileNo() {
		return studentMobileNo;
	}
	public void setStudentMobileNo(String studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}
	public String getMachineText() {
		return machineText;
	}
	public void setMachineText(String machineText) {
		this.machineText = machineText;
	}
	public int getLoggedInMachine() {
		return loggedInMachine;
	}
	public void setLoggedInMachine(int loggedInMachine) {
		this.loggedInMachine = loggedInMachine;
	}
	public String getLicenseStatus() {
		return licenseStatus;
	}
	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}
	public String getLicenseC2V() {
		return licenseC2V;
	}
	public void setLicenseC2V(String c2v) {
		this.licenseC2V = c2v;
	}
	public String getLicenseV2C() {
		return licenseV2C;
	}
	public void setLicenseV2C(String v2c) {
		this.licenseV2C = v2c;
	}

}
