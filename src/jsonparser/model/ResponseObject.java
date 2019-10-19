package com.praxis.video.model;

public class ResponseObject<T> {
	
	private  int responseCode;
	private  String responseDesc;
	T data;
	
	public String getResponseDesc() {
		return responseDesc;
	}
	public  ResponseObject<T> setResponseDesc(String errorDesc) {
		this.responseDesc = errorDesc;
		return this;
	}
	public int getResponseCode() {
		return responseCode;
	}
	public  ResponseObject<T> setResponseCode(int errorCode) {
		this.responseCode = errorCode;
		return this;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	

}
