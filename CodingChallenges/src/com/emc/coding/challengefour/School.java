package com.emc.coding.challengefour;

import java.util.Scanner;

public class School {
	
	String passorfail(int mark){
		if(mark >= 35) {
			return "Pass";
		}
		else {
			return "Fail";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		School s1 = new School();
		
		int mark = sc.nextInt();
		System.out.println(s1.passorfail(mark));
		

	}

}
