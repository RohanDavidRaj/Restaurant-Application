package com.technoelevate.javabasics.abstraction;

public class Driver {
	
	public static void drive(Car car) {
		car.acc();
		car.brake();
		car.gear();
		car.airBag();
	}
}
