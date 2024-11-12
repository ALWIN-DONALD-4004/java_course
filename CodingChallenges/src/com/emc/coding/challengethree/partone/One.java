package com.emc.coding.challengethree.partone;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Starting number :");
		int start = sc.nextInt();
		
		System.out.println("enter the ending number : ");
		int end = sc.nextInt();
		
		for (int i = start ; i<=end ;i++) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
