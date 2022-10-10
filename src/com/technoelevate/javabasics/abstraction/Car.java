package com.technoelevate.javabasics.abstraction;

public interface Car {
	void brake();

	void acc();

	void gear();
	
	default void airBag()
	{}

}
