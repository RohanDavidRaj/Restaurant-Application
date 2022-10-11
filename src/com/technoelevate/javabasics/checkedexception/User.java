package com.technoelevate.javabasics.checkedexception;

import java.util.Scanner;

public class User {

	public static void main(String[] args) throws VoteValidException {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		
			Vote.checkAge(sc.nextInt());
		

			
	}

}
