package com.technoelevate.javabasics;

public class AccessMethods {

	public static void main(String[] args) {
		AccessSpecifierDemo accessSpecifierDemo = new AccessSpecifierDemo();
		accessSpecifierDemo.methodPublic();
		// accessSpecifierDemo.methodPrivate();     //private method 
		accessSpecifierDemo.methodProtected();
		accessSpecifierDemo.methodDefault();
	}

}
