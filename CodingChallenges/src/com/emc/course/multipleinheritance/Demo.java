package com.emc.course.multipleinheritance;

interface Printable{
	
	void display();
	
}

interface Showable{
	void display();
}

class Document implements Printable,Showable{

	@Override
	public void display() {
		System.out.println("class Document");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Document c1 = new Document();
		c1.display();

	}

}
