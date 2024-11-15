package com.emc.coding.challengethree.parttwo;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i<=10;i++) {
			System.out.println(n + " X " + i + " = " + n*i);
		}
		sc.close();
	}

}
