package com.emc.coding.challengeone;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Name : ");
		String Name = sc.nextLine();
		
		System.out.print("Enter your Age : " );
		int Age = sc.nextInt();
		
		System.out.println("Your Name is  " + Name + " and you are "
		+Age + " years old. ");
		
		sc.close();

	}

}
