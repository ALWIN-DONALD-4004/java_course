package com.emc.coding.challengeone;
import java.util.*;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = a*b*c;
		int e = a+b+c;
		
		System.out.println(d/e);
		
		sc.close();


	}

}
