package com.emc.course.random;
import java.util.Random;
public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int random_number = rand.nextInt(10);// from 0 to 10
		System.out.println(random_number);
		
		
	}

}
