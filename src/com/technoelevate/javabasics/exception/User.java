package com.technoelevate.javabasics.exception;

public class User {
   public static void main(String[] args) {
	Bank bank=new Bank(1000);
	try {
		bank.withDraw(3000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
