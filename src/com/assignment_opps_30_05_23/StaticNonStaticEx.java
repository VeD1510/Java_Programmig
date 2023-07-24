package com.assignment_opps_30_05_23;

public class StaticNonStaticEx {
	
	static int num1 = 10;
	int num2 = 20;
	
	public static int add()
	
	{	StaticNonStaticEx s1 = new StaticNonStaticEx();
		
		return StaticNonStaticEx.num1+s1.num2;
	}
	
	public void display()
	{
		StaticNonStaticEx s1 = new StaticNonStaticEx();
		System.out.println(StaticNonStaticEx.num1+" + "+s1.num2+" = "+StaticNonStaticEx.add());
	}

	public static void main(String[] args) {
		
		StaticNonStaticEx s1 = new StaticNonStaticEx();
		s1.display();

	}

}
