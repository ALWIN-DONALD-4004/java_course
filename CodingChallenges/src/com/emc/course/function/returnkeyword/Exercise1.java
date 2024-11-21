package com.emc.course.function.returnkeyword;

import java.util.Scanner;

public class Exercise1 {
	
	String getName(String name) {
		return name;
	}
	
	int getPhone(int no) {
		return no;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Exercise1 e1  = new Exercise1();

		String name = sc.nextLine();
		int phone = sc.nextInt();
		
		System.out.println(e1.getName(name));																															
		System.out.println(e1.getPhone(phone));
		
	sc.close();
	}

}
