package com.emc.coding.challengefive.animalkingdom;

public class Cat extends Animal{
	
	String Colour;
	
	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}
	
	public void climb() {
		System.out.println("Cat can climb");
	}

}
