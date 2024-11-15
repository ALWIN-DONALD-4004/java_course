package com.emc.coding.challengethree.parttwo;
import java.util.*;
public class Two {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		
		for(int i = 0 ; i<10;i++) {
			number[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i<10;i++) {
			System.out.print(number[i]+" ");
		}
		sc.close();

	}

}
