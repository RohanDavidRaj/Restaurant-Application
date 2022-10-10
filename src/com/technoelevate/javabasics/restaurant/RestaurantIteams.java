package com.technoelevate.javabasics.restaurant;

import java.util.*;

public class RestaurantIteams {
	static Scanner sc = new Scanner(System.in);
	static boolean bool = true;
	static int total = 0;
	static List<String> list = new ArrayList<String>();
	
	static String[] iteams = { "dhosa", "idly", "puri", "maggi" };

	public static void iteams() {

		System.out.println("***Welcome to -EAT REPEAT-  Restaurant*** \n Menu available");

		System.out.println("1 " + iteams[0] + " 10$ \n" + "2 " + iteams[1] + " 20$ \n" + "3 " + iteams[2] + " 30$ \n"
				+ "4 " + iteams[3] + "30$ \n" + "5 " + "ORDER");
		System.out.println("Enter the iteams choice number to add To 'cart'");
}
	
	public static void choice() {
		while (bool) {

			int input = sc.nextInt();
			switch (input) {
			case 1:
				total = total + 10;
				list.add(iteams[0]);
				System.out.println("Your " + "'" + iteams[0] + "'" + " is added to cart" + list
						+ " \n Want Buy more Enter 'choice'\n --Enter 5 to ORDER-- ");

				break;
			case 2:
				total += 20;
				list.add(iteams[1]);
				System.out.println("Your " + "'" + iteams[1] + "'" + " is added to cart" + list
						+ " \n Want Buy more Enter 'choice'\n --Enter 5 to ORDER-- ");

				break;
			case 3:
				total += 30;
				list.add(iteams[2]);
				System.out.println("Your " + "'" + iteams[2] + "'" + " is added to cart" + list
						+ " \n Want Buy more Enter 'choice'\n --Enter 5 to ORDER-- ");

				break;
			case 4:
				total += 30;
				list.add(iteams[3]);
				System.out.println("Your " + "'" + iteams[3] + "'" + " is added to cart" + list
						+ " \n Want Buy more Enter 'choice'\n --Enter 5 to ORDER-- ");

				break;

			case 5:
				bool = false;
				break;
			}

		}
		System.out.println("Order successfully placed");
		System.out.println("your total iteams purchased" + list + " \n" + "Total Amount = " + total+"$");
	
		
	}


}
