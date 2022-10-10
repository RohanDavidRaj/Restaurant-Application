package com.technoelevate.javabasics.abstraction;

public class Audi implements Car {
	@Override
	public void brake() {
		System.out.println("Audi brake");

	}

	@Override
	public void acc() {
		System.out.println("Audi Acc");

	}

	@Override
	public void gear() {
		System.out.println("Audi gear");

	}
	@Override
	public void airBag() {
		System.out.println("airBag");
	}
}
