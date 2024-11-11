package com.emc.coding.challengetwo.parttwo;
import java.util.*;
public class Three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the colour : ");
		String color = sc.next();
		
		if(color.equals("red")) {
			System.out.println("Stop");
		}
		else if(color.equals("yellow")) {
			System.out.println("Get Ready");
		}
		else if(color.equals("green")) {
			System.out.println("Go...");
		}
		sc.close();
	}
}