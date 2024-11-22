package com.emc.coding.challengefour;

import java.util.Scanner;

public class Find {
	
	void evenodd(int num) {
		if (num %2 == 0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Find n1 = new Find();
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		n1.evenodd(num);
		

	}

}
