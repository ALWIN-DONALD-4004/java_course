package com.emc.coding.challengetwo.partone;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if((num % 3 == 0) && (num % 5 == 0)) {
			System.out.print("the number is divisible by 3 & 5");
		}
		else {
			System.out.println("the number is not divide by 3 & 5");
		}
		sc.close();
	}

}
