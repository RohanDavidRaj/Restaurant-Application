package com.technoelevate.javabasics.abstraction;

public class Bmw implements Car {

	@Override
	public void brake() {
		System.out.println("BMW brake");
	}

	@Override
	public void acc() {
		System.out.println("BMW acc");
	}

	@Override
	public void gear() {
		System.out.println("BMW gear");
	}

}
