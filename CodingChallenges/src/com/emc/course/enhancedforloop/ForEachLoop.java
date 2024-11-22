package com.emc.course.enhancedforloop;

public class ForEachLoop {
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7};
		String[] name = {"Alwin","athi","chan","ari","mani"};
		
		for(int var:num) {
			System.out.println(var);
		}
		
		for(String var:name) {
			System.out.println(var);
		}
	}

}
