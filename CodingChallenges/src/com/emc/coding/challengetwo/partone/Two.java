package com.emc.coding.challengetwo.partone;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int income = sc.nextInt();
		if(income < 7000) {
			System.out.println("Scholarship is available");
		}
		else {
			System.out.println("not eligble for scholarship");
		}
		sc.close();
	}
}
