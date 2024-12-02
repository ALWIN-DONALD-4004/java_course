package com.emc.coding.challengeseven.one;

public class DivisionExample {
	
	public void divideNumbers(int numerator,int Denominator) {
		int result = 0;
		try {
			result = numerator/Denominator;
		}
		catch (ArithmeticException e) {
			System.out.println("cannot Divide by Zero(0)");
		}
		finally {
			if(result>0) {
				System.out.println(result);
			}	
		}
		
	}
}
