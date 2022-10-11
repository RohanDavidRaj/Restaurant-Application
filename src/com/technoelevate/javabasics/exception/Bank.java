package com.technoelevate.javabasics.exception;

public class Bank {
	
	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}
	
	public void withDraw(int withdraw) {
		if (withdraw <= balance) {
			this.balance-=withdraw;
		}
		else {
			throw new BalanceException();
		}
		
	}
	
	

}
