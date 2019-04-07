package com.kodumunkodu.lesson2.scope;

public class Singleton {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Message : " + message; 
	}
	
}
