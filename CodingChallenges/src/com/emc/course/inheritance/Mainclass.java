package com.emc.course.inheritance;

class Dad{
	int money =10000;
}

class Son extends Dad{
	
}

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s1 = new Son();
		System.out.println(s1.money);
		
	}
}
