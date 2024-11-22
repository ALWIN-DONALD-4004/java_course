package com.emc.course.methodoverloading;

public class Demo {
	
	void function(int a) {
		System.out.println("one");
	}
	
	void function(int a,int b) {
		System.out.println("two");
	}
	
	void function(int a,int b,int c) {
		System.out.println("three");
	}
	
	public static void main(String[] args) {
		Demo f1 = new Demo();
		
		f1.function(1);
		f1.function(12,2);
		f1.function(1, 2, 3);
	}

}
