package com.emc.course.function.parameters;

import java.util.Scanner;

public class Calculator {
	
	void sum(int x,int y) {
		System.out.println("Addition of x & y : "+(x+y));
	}
	
	void sub(int x,int y) {
		System.out.println("Subraction of x & y : "+(x-y));
	}

	void mul(int x,int y) {
		System.out.println("Multiplication of x & y : "+(x*y));
	}

	void div(int x,int y) {
		System.out.println("Divition of x & y : "+ (x/y));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt() ;
		int y = sc.nextInt();
		
		Calculator c1 = new Calculator();
		
		c1.sum(x,y);
		c1.sub(x, y);
		c1.mul(x, y);
		c1.div(x, y);
		
		
	}

}
