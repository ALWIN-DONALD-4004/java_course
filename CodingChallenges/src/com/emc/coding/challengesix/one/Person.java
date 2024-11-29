package com.emc.coding.challengesix.one;

public class Person {
	
	public String name;
	
	protected int age;
	

	@SuppressWarnings("unused")
	private int socialSecurityNumber;
	
	String address;
	
	
	Person(String name,int age , int ssn , String address){
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = ssn;
		this.address = address;
		
		
//		System.out.println(socialSecurityNumber);
	}
}
