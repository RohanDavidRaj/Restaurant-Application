package com.technoelevate.javabasics.restaurant;

public class FaultInput extends RuntimeException{
	
private String msg;
	
	public FaultInput(String msg) {
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
    
	   
}
