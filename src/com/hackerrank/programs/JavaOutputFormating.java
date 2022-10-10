package com.hackerrank.programs;

import java.util.*;

public class JavaOutputFormating {
	
	 public static void format(String s1)
     {
		 String[] c=new String[17];
		 int count = 0;			
			String num = "";
			String alpa = "";

			for (int i = 0; i < s1.length(); i++) {
				if (Character.isDigit(s1.charAt(i))) {
					num = num + s1.charAt(i);
				} else if (Character.isAlphabetic(s1.charAt(i))) {
					alpa = alpa + s1.charAt(i);
				}
			}
			int temp = Integer.parseInt(s1.split(" ")[1]);
			while (temp != 0) {
				temp = temp / 10;
				++count;
			}

			if (count == 1) {
				System.out.println(alpa + "   00" + num);
				
			} else if (count == 2) {
				System.out.println(alpa + "       0" + num);
			} else {
				System.out.println(alpa + "      " + num);

			}
			
			 String strArray[] = alpa.split(" ");
            System.out.println(strArray[0]);
		 
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
		}
        System.out.println("================================");


	}
}
