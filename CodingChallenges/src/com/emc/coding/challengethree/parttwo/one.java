package com.emc.coding.challengethree.parttwo;
import java.util.*;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number[] = new int[5];
		
		for (int i = 0 ; i<5 ; i++) {
			number[i] = sc.nextInt();
		}
		
		for (int i = 0 ; i<5 ; i++) {
			System.out.println(number[i]);
		}
		
	
		sc.close();
	}
}
