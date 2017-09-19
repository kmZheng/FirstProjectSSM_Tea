package com.company.demo.service.exception;

public class MyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public MyException(String expMsg) {
		super(expMsg);
	}
	public MyException(String message,Throwable cause){
		super(message,cause);
	}
}
