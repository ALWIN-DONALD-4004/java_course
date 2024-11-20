package com.emc.course.function;

public class Addition {
	
	int a = 10;
	int b = 20;
	
	void add() {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Addition a1 = new Addition();
		
		a1.add();
	}

}
