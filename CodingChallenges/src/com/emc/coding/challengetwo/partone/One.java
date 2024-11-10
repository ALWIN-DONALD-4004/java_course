package com.emc.coding.challengetwo.partone;
import java.util.*;
public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mark = sc.nextInt();
		if(mark > 34) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		sc.close();
	}

}
