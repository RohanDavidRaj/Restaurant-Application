package com.technoelevate.javabasics.checkedexception;

public class Vote {

	public static void checkAge(int age) throws VoteValidException {
		if (age < 18) {
			throw new VoteValidException("Age is below 18");
		} else {
			System.out.println("you can vote");
		}
	}

}
