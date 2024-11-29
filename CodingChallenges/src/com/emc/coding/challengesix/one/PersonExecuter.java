package com.emc.coding.challengesix.one;

public class PersonExecuter {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Alwin",18,4004,"villupuram");
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.address);
		
		//we cannot access ssc because it is protected
		//System.out.println(e1.ssn);
	}

}
