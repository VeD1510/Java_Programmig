package com.assignment_inher_01_06_23;

public class Override_1 {

	public static void main(String[] args) {
		//Vehicle c = new Bike();
		//c.displayWheels();
		
		Parent p = new Child();
		p.show();
		p.show(2);
		System.out.println(p.a);
		


	}
}
//
//class Vehicle {
//
//	static void displayWheels() {
//
//		System.out.println(".......");
//	}
//
//}
//
//class Bike extends Vehicle {
//	@Override 
//	static void displayWheels() {
//
//		System.out.println(2);
//	}
//}

 class Parent 
{
	 
	 String a = "Parent";
	 void show()
	 {
		 System.out.println("In Parent Class.......1");
	 }
	 void show(int a)
	 {
		 System.out.println("In Parent Class........2");
	 }
	 
}

class Child extends Parent
{
	String a = "Child";
	@Override
	void show()
	{
		System.out.println("In Child Class...........1");
	}
	void show(int b)
	{
		System.out.println("In Child Class...........2");
	}
}