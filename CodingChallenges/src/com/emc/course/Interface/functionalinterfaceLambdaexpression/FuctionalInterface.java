package com.emc.course.Interface.functionalinterfaceLambdaexpression;

interface A{
	void disp();
}

interface B{
	void disp();
}

public class FuctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A() {
			public void disp() {
				System.out.println("hello");
			}
		};
		
		a1.disp();
		
		//lambda Expression
		
		B b1 = ()->{System.out.println("hey...");};
		b1.disp();
	}

}
