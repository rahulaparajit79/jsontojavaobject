package jsonparser.mpmodel;

import java.util.Date;

public class SoftwareUpdate {

	private int id;
	private String updateVersion;
	private Date releaseDate;
	private String whatsNew;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the updateVersion
	 */
	public String getUpdateVersion() {
		return updateVersion;
	}
	/**
	 * @param updateVersion the updateVersion to set
	 */
	public void setUpdateVersion(String updateVersion) {
		this.updateVersion = updateVersion;
	}
	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	/**
	 * @return the whatsNew
	 */
	public String getWhatsNew() {
		return whatsNew;
	}
	/**
	 * @param whatsNew the whatsNew to set
	 */
	public void setWhatsNew(String whatsNew) {
		this.whatsNew = whatsNew;
	}
}
