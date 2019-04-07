package com.kodumunkodu.lesson3.autowiring;

public class ByType {
	
	private Message messageByType;// bu isimle ayný isimde bean otomatik inject olur
	private String whichOne;


	public String getWhichOne() {
		return whichOne;
	}

	public void setWhichOne(String whichOne) {
		this.whichOne = whichOne;
	}

	public Message getMessageByType() {
		return messageByType;
	}

	public void setMessageByType(Message messageByType) {
		this.messageByType = messageByType;
	}
	

}
