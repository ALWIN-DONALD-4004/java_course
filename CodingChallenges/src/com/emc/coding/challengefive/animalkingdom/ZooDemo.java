package com.emc.coding.challengefive.animalkingdom;

public class ZooDemo {
	
public static void main(String[] args) {
		Animal a1 = new Animal();
	
		a1.name = "xyz";
		a1.age = 20;
		a1.makeSound();
		
		Dog b1 = new Dog();
		b1.name = "Fred";
		b1.age = 18;
		b1.breed = "labour";	
		System.out.println(b1.name + "\n" +b1.age);
		b1.makeSound();
		b1.fetch();
		
		System.out.println();
		
		Cat c1 = new Cat();
		c1.name = "joye";
		c1.age=13;
		c1.Colour = "white";
		System.out.println(c1.name + "\n" + c1.age + "\n" + c1.Colour);
		c1.makeSound();
		c1.climb();
		
		
	}
}
