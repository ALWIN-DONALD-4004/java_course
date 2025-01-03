package com.emc.collections.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //flexible & redundancy
		
		//to add elements in array
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		//to get the element by get()
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		//to update array
		list.set(1, 800);
		System.out.println(list);
		
		
		//to remove element in array
		list.remove(2);
		System.out.println(list);
		
		for(int var:list) {
			System.out.println(var);
		}
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=1 ;i<=5;i++) {
			list1.add(sc.next());
		}
		
		//by using iterator we able to get values from one by one
		Iterator<String> i = list1.iterator();
			
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(list1);
		
		
		sc.close();
	}

}
