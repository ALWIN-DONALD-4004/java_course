package com.emc.coding.challengesix.four;

public class AnimalExecuter {
	
	public static void main(String[] args) {
		Dog d1 = new Dog("Timmy");
		System.out.println(d1.name);
		d1.makeSound();
		
		Cat c1 = new Cat("helse");
		System.out.println(c1.name);
		c1.makeSound();
	}

}
