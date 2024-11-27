package com.emc.coding.challengefive.animalkingdom;

public class Dog extends Animal{
	
	String breed;
	
	@Override
	public void makeSound() {
		System.out.println("Dog Barks");
	}
	
	public void fetch() {
		System.out.println("Dog is fetching");
	}

}
