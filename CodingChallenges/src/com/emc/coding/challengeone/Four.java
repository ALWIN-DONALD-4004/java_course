package com.emc.coding.challengeone;
import java.util.*;

public class Four {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your name : ");
	String name = sc.nextLine();
	
	System.out.print("Entre your Score : ");
	int score = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Enter your Department : ");
	String dept = sc.next();
	
	double score1 = (score/100.0)*10;
	
	System.out.print("\nYour Name is : " + name );
	System.out.printf( "\nYou Scored : %.1f" , score1 , " CGPA");
	System.out.println( "\nYou are from " + dept + " Department");
				      
  sc.close();
  
  }
}
