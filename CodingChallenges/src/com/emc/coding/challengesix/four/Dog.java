package com.emc.coding.challengesix.four;

public class Dog extends Animal{
	
	Dog(String name){
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Bow Bow");
	}

}
