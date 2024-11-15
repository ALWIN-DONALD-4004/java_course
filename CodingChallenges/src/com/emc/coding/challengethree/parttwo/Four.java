package com.emc.coding.challengethree.parttwo;
import java.util.*;
public class Four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int range = sc.nextInt();
		
		System.out.println("Enter the array elements:");
		int[] arr = new int[range];
		
		for(int i = 0; i<range ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("the middle element of the array is : "+arr[range/2]);
		
		sc.close();
	}

}
