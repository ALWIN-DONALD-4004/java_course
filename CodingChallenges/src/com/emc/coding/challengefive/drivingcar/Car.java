package com.emc.coding.challengefive.drivingcar;

public class Car extends Vehicle {
	String fueltype;
	
	@Override 
	public void startEngine() {
		System.out.println("Car Engin Starts");
	}
	
	public void drive() {
		System.out.println("car is driving");
	}

}
