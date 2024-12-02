package com.emc.coding.challengeseven.two;

import java.util.Scanner;

public class AgeValidationExecuter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AgeValidator a1 = new AgeValidator();
		
		a1.checkAge(sc.nextInt());
		
		sc.close();

	}

}
