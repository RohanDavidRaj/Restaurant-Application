package com.technoelevate.javabasics;

public class AccessSpecifierDemo {

	public void methodPublic() {
		System.out.println("Public Method");
	}

	private void methodPrivate() {
		System.out.println("Private Method");
	}

	protected void methodProtected() {
		System.out.println("Protected Method");
	}

	void methodDefault() {
		System.out.println("Default Method");
	}
	
//	main method
	public static void main(String[] args) {
		AccessSpecifierDemo accessSpecifierDemo=new AccessSpecifierDemo();
		accessSpecifierDemo.methodPublic();
		accessSpecifierDemo.methodPrivate();
		accessSpecifierDemo.methodProtected();
		accessSpecifierDemo.methodDefault();
	}

}
