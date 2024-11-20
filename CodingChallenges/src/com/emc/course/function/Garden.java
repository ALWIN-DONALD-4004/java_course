package com.emc.course.function;

public class Garden {
	
	int apple_price = 20;
	int apple_count = 5;
	
	void total_count() {
		System.out.println(apple_price*apple_count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garden g1 = new Garden();
		g1.total_count();
	}

}
