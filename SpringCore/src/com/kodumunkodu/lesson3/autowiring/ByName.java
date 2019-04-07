package com.kodumunkodu.lesson3.autowiring;

public class ByName {

	private Message messageByName;// bu isimle ayný isimde bean otomatik inject olur
	private String whichOne;


	public String getWhichOne() {
		return whichOne;
	}

	public void setWhichOne(String whichOne) {
		this.whichOne = whichOne;
	}

	public Message getMessageByName() {
		return messageByName;
	}

	public void setMessageByName(Message messageByName) {
		this.messageByName = messageByName;
	}

	
	
	
}
