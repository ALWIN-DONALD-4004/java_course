package com.emc.course.classandobject;

public class Laptop {
	
	String name = "";
	String proc = "";
	int ram = 0;
	int price = 0;

	public String toString() {
		return "Laptop [name=" + name + ", proc=" + proc + ", ram=" + ram + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l1 = new Laptop();
		
		l1.name = "HP";
		l1.proc = "i5";
		l1.ram = 8;
		l1.price = 52000;
		System.out.println(l1);
		
		
		Laptop l2 = new Laptop();
		
		l2.name = "Dell";
		l2.proc = "i5";
		l2.ram = 8;
		l2.price = 40000;
		System.out.println(l2);
		
		
		

	}


}
