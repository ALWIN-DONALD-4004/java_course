 package com.emc.coding.challengesix.five;

public class VechicleExecuter {
	
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(Vechicle.getVehicle("TATA"));
		c1.StartEngine();
		c1.drive();
		
		System.out.println();
		
		Motocycle m1 = new Motocycle();
		System.out.println(Vechicle.getVehicle("Asoka Lyland"));
		m1.StartEngine();
		m1.drive();
	}

}
