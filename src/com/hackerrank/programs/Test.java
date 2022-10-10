package com.hackerrank.programs;

import java.util.Arrays;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {

		int count = 0;
		String num = "";
		String alpa = "";
		String[] c = new String[17];

		String s1 = "java 10";
		String strArray[] = s1.split(" ");
		System.out.println(Arrays.toString(strArray));

		c[0] = strArray[0];
		c[16] = strArray[1];

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isDigit(s1.charAt(i))) {
				num = num + s1.charAt(i);
			}
		}

		int temp = Integer.parseInt(num);
		while (temp != 0) {
			temp = temp / 10;
			++count;
		}
		
//    for add 0 to number
		if (count == 1) {
			System.out.println( "00"+num);
			
		} else if (count == 2) {
			System.out.println(alpa + "0"+ num);
		} else {
			System.out.println(alpa + ""+ num);
		}

		for (int i = 0; i < alpa.length(); i++) {
			if (c[i] != null) {
				System.out.print(c[i]);
			} else {
				System.out.print(" ");
			}
		}
		
		System.out.println(num);

//	  int n=s1.length()-1;
//	  System.out.println(n);
//
//		for (int i = 0; i < c.length; i++) {
//			if (Character.isDigit(s1.charAt(n-1))) {
//				num = num + s1.charAt(i);
//				c[c.length-1]=0;
//			} else if (Character.isAlphabetic(s1.charAt(n))) {
//				alpa = alpa + s1.charAt(i);
//			    c[i]=s1.charAt(n);
//			    n++;
//			}else
//			{
//				c[i]=1;
//			}
//		   
//			
//		}

		// System.out.println(c);
	}
}
