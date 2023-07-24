package com.abstract_final_interface_practice_05_06_23;

//public class Demo {
//	
//	public final void show()
//	{
//		System.out.println("This Final Method......1");
//	}
//
//}
//class Demo2 extends Demo
//{
//	public final void show()
//	{
//		System.out.println("This is Final Method 2");
//	}
//}

public class Demo 
{
	public static void main(String[] args) {
		Car v = new BMW();
		v.type();
		v.wheels();
	}
		
}

abstract class Vehicle
{
	public Vehicle()
	{
		System.out.println(">>>>>>>>>>>>>");
	}
	abstract void type();
	void wheels()
	{
		System.out.println(".........");
	}
}

abstract class Car extends Vehicle
{
	public Car()
	{
		System.out.println("<<<<<<<<<<<<");
	}
	abstract void type();
	@Override
	void wheels()
	{
		System.out.println("4 Wheels");
	}
}

class BMW extends Car
{
    public BMW()
    {
    	
    }
	void type() 
	{
		System.out.println("4 Wheeler");
	}
}

