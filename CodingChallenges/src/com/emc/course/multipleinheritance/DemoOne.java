package com.emc.course.multipleinheritance;

interface Readable{
	void read();
}

interface Writable {
	void write();
}

interface Storable{
	void store();
}

class Task implements Readable,Writable,Storable{

	@Override
	public void store() {	
		System.out.println("Store the data");
	}

	@Override
	public void write() {
		System.out.println("write the data");
	}

	@Override
	public void read() {
		System.out.println("read the data");
	}
	
}

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task t1 = new Task();
		t1.read();
		t1.write();
		t1.store();

	}

}
