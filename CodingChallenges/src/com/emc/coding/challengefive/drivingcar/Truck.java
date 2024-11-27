package com.emc.coding.challengefive.drivingcar;

public class Truck extends Vehicle {
	int loadcapasity;
	@Override
	public void startEngine() {
		System.out.println("Truck Engine starts......");
	}
	
	public void haul() {
		System.out.println("ZTruck is hauling");
	}

}
