package com.technoelevate.javabasics.abstraction;

import java.util.Scanner;

public class CarFactory {

	public static Car getCar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Car");
		String str = scanner.next();
		
		if (str.equalsIgnoreCase("audi")) {
			return new Audi();

		} else if (str.equalsIgnoreCase("bmw")) {
			return new Bmw();
		}
		
		return null;

	}

}
