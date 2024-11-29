package com.emc.coding.challengesix.five;

public abstract class Vechicle {
	
	abstract public void drive();
	
	final void StartEngine() {
		System.out.println("Engine Started");
	}
	
	static public String getVehicle(String name) {
		return name;
	}

}
