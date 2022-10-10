package com.technoelevate.accessmethods;

import com.technoelevate.javabasics.AccessSpecifierDemo;

public class AccessMethodFromPacakage extends AccessSpecifierDemo {

	public static void main(String[] args) {
		AccessMethodFromPacakage accessMethodFromPacakage = new AccessMethodFromPacakage();
		// accessSpecifierDemo.methodPrivate();
		accessMethodFromPacakage.methodProtected();
		accessMethodFromPacakage.methodPublic();
      
	 }

}
