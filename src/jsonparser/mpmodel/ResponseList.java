package jsonparser.mpmodel;

import java.util.List;

public class ResponseList<T> {
	
	private  int responseCode;
	private  String responseDesc;
	
	public String getResponseDesc() {
		return responseDesc;
	}
	public  void setResponseDesc(String errorDesc) {
		this.responseDesc = errorDesc;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public  void setResponseCode(int errorCode) {
		this.responseCode = errorCode;
	}
	
	List<T> list;

	public List<T> getList() {
		return list;
	}
	public void setList(List<T> dataList) {
		this.list = dataList;
	}
	

}
