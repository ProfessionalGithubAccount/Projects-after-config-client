package com.iiht.restjpa.exceptions;

import java.util.Date;

public class MyErrorResponse {

	private String message;
	private String errorCode;
	private Date time;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public MyErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyErrorResponse(String message, String errorCode, Date time) {
		super();
		this.message = message;
		this.errorCode = errorCode;
		this.time = time;
	}
	//we cznt write tostring since we wont be printing in to the console..we will be showing on webpage 
}
