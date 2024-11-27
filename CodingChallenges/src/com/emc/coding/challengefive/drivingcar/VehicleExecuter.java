package com.emc.coding.challengefive.drivingcar;

public class VehicleExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		
		c1.brand = "TATA";
		c1.year = 2010;
		c1.fueltype = "EV";
		System.out.println(c1.brand+"\n"+c1.year+"\n"+ c1.fueltype);
		c1.startEngine();
		c1.drive();
		
		System.out.println();
		
		Truck t1 = new Truck();
		
		t1.brand = "Asoka lyland";
		t1.year = 2012;
		t1.loadcapasity = 1000;
		System.out.println(t1.brand+"\n"+t1.year+"\n"+t1.loadcapasity);
		t1.startEngine();
		t1.haul();


	}

}
