package com.emc.course.constructor;

public class ParameterizedConstructor {
	
	int marks ;
	String name;
	
	ParameterizedConstructor(){
		System.out.println("hello");
	}
	
	ParameterizedConstructor(int a){
		System.out.println("a");
		System.out.println("NUmber");
	}
	
	
	
	public static void main(String[] args) {
		ParameterizedConstructor p1 = new ParameterizedConstructor();
		
		ParameterizedConstructor p2 = new ParameterizedConstructor(10);
		
		
	}

}
