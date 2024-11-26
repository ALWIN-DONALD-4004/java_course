package com.emc.course.inheritance.herical;
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
public class Demo {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		c1.eat();
		c1.meow();
		d1.eat();
		d1.bark();
	}
}
