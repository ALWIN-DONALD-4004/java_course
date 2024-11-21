package com.emc.course.function.returnkeyword;

public class Return {
	
	int sum(int x , int y) {
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 30;
		
		Return r1 = new Return();
		int add = r1.sum(x, y);
		System.out.println(add);

	}

}
