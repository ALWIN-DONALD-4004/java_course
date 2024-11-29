package com.emc.coding.challengesix.two;

public class Counter {
	
	static int count = 0 ;
	
	int instanceNumber = 0;
	
	
	Counter(){
		count = count+1;
		instanceNumber = instanceNumber+1;
	}
	
	public void disp() {
		System.out.println("count : " +count);
		System.out.println("instanceNumber : " +instanceNumber);
	}

}
