package com.technoelevate.javabasics.exception;

public class BalanceException extends RuntimeException {

	public BalanceException() {
		super("Balance is incufficient");
	}
}
