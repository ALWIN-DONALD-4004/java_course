package com.emc.coding.challengeone;
import java.util.*;
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Scanner sc = new Scanner(System.in);
		 
		 String name;
		 int age;
		 String address;
		 
		 System.out.print("Enter your Name : ");
		 name = sc.nextLine();
		 
		 System.out.print("Enter your Age : " );
		 age =sc.nextInt();
		 sc.nextLine();
		 
		 System.out.print("Enter your Address : ");
		 address = sc.nextLine();
		 
		 
		 System.out.println("Hi " + name + "\nyou are " + age + "years old"
				 +"\nfrom \n" + address);
		 
		 sc.close();

	}

}
