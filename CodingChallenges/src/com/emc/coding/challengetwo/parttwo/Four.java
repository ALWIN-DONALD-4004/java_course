package com.emc.coding.challengetwo.parttwo;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary : ");
		int salary = sc.nextInt();		
		
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		if(salary>=20000 || age<=25) {
			System.out.println("Enter the Loan amount : ");
			int loan = sc.nextInt();
			if(loan <= 50000) {
				System.out.println("you are eligible for loan ");
			}
			else {
				System.out.println("maximum loan amount is 50000");
			}
		}
		else {
			System.out.println("you are not eligible for loan ");
		}
		sc.close();
	}

}
