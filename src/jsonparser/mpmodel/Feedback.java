package jsonparser.mpmodel;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;

/**
 * The persistent class for the feedback database table.
 * 
 */

public class Feedback implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String description;

	private Date feedbackDate;

	private boolean isComplaint; // true=complain,flase=compliment

	private String remarks;

	private Date resolvedDate;

	private Long studentId;

	private String subject;

	

	public Feedback() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getFeedbackDate() {
		return this.feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	public boolean getIsComplaint() {
		return this.isComplaint;
	}

	public void setIsComplaint(boolean isComplaint) {
		this.isComplaint = isComplaint;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getResolvedDate() {
		return this.resolvedDate;
	}

	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	public Long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}