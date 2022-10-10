package com.technoelevate.javabasics.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car = CarFactory.getCar();
		Driver.drive(car);
	}
}
