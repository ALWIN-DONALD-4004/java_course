package com.emc.coding.challengeseven.two;

public class AgeValidator {
	
	public void checkAge(int age) {
	
		try{
			if(age<0 || age>150) {
				throw new InvalidAgeException("Age is invalid");
		}
			else {
				System.out.println("Age  is  valid");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Your age is "+ age);
	}

}
