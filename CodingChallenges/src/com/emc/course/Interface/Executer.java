package com.emc.course.Interface;

interface Animal{
	int mark = 20; //public static final
	void sound();
	
//	after java 8
	
	default void disp() {
		
	}
	
	static void disp1() {
		
	}
}

class Cat implements Animal{
	
	public void sound() {
		System.out.println("meow....");
	}
}



public class Executer {

	public static void main(String[] args) {
		
		
	//	Animal a1 = new Animal(); // we cannot create object for interface
		//no constructor for interface
		
		
		Cat c1 = new Cat();
		c1.sound();
	}

}
