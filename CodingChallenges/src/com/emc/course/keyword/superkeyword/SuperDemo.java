package com.emc.course.keyword.superkeyword;

class Person{
	String name;
	
	Person(String name){
		this.name = name;
		System.out.println(name);
	}
}

class Employee extends Person{
	Employee(String name){
		super(name);
	}
	
}

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1 = new Person("Alwin");
		Employee e1 = new Employee("aliwn");
		

	}

}
