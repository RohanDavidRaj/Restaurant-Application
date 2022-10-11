package com.hackerrank.programs;

import java.util.*;

public class JavaOutputFormating {
	
	public static void format(String arr) {

		int count = 0;
		String num = "";
		String[] c = new String[17];

		String s1 = "java 10";
		String strArray[] = s1.split(" ");

//remove number from string
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {
				num = num + s1.charAt(i);
			}
		}

//count number 
		int temp = Integer.parseInt(num);
		while (temp != 0) {
			temp = temp / 10;
			++count;
		}

// for add 0 to number
		if (count == 1) {
			num = "00" + num;

		} else if (count == 2) {
			num = "0" + num;
		}

		String strArray1[] = num.split(" ");
		c[0] = strArray[0];
		c[16] = strArray1[0];

		for (int i = 0; i < c.length; i++) {
			if (c[i] != null) {
				System.out.print(c[i]);
			} else {
				System.out.print(" ");
			}
		}

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        
        String[] arr=new String[3];
		for (int j = 0; j < 3; j++) {
                arr[j]=sc.nextLine();
                 
				}
		for (int i = 0; i < arr.length; i++) {
			format(arr[i]);
			System.out.println();
		}
        System.out.println("================================");


	}
}
