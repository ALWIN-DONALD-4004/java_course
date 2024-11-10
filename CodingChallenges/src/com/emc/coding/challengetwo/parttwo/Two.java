package com.emc.coding.challengetwo.parttwo;
import java.util.*;
public class Two {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sub1,sub2,sub3,sub4,sub5;
		float average;
		
		System.out.print("Enter the first mark: ");
	    sub1 = sc.nextInt();
	        
	    System.out.print("Enter the second mark: ");
	    sub2 = sc.nextInt();
	        
	    System.out.print("Enter the third mark: ");
	    sub3 = sc.nextInt();
	        
	    System.out.print("Enter the fourth mark: ");
	    sub4 = sc.nextInt();
	        
	    System.out.print("Enter the fifth mark: ");
	    sub5 = sc.nextInt();
	    
	    average = (sub1 + sub2 + sub3 + sub4 +sub5)/5;
	    
	    if(average < 35) {
	    	System.out.println("Additional class is requried");
	    }
	    
	    else {
	    	System.out.println("you are good");
	    }
	    
	    
	}
}
