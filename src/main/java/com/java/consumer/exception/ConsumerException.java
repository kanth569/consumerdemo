package com.java.consumer.exception;

public class ConsumerException extends Exception {

	private int messageCode;

	public ConsumerException() {
		// TODO Auto-generated constructor stub
	}

	public ConsumerException(int messageCode, String message) {
		super(message);
		this.messageCode = messageCode;
	}

	public int getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}


}
