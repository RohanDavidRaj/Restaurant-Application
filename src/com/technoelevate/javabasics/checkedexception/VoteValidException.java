package com.technoelevate.javabasics.checkedexception;

public class VoteValidException extends Exception {
	
	private String msg;
	
	public VoteValidException(String msg) {
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}

}
