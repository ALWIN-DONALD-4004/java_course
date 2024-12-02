package com.emc.coding.challengeseven.one;

import java.util.Scanner;

public class DivisionExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		DivisionExample d1 = new DivisionExample();
		
		d1.divideNumbers(sc.nextInt(),sc.nextInt());
		
		sc.close();
	}

}
