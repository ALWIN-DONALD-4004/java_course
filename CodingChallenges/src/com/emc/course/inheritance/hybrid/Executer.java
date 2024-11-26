package com.emc.course.inheritance.hybrid;

class Animal{
	void eat() {
		System.out.println("this animal can eat");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks...");
	}
}

class Cat extends Animal{
	void meow() {
		System.out.println("Cat meow...");
	}
}

class Puppy extends Dog{
	void weep() {
		System.out.println("weep");
	}
}

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat();
		Puppy d1 = new Puppy();
		c1.eat();
		c1.meow();
		d1.eat();
		d1.bark();
		d1.weep();

	}

}
