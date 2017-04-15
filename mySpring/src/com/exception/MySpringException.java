package com.exception;

public class MySpringException extends RuntimeException {
	private String exceptionMsg;
	public String getExceptionMsg() {
		return exceptionMsg;
	}
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	public MySpringException(String msg){
		this.exceptionMsg=msg;
	}
}
