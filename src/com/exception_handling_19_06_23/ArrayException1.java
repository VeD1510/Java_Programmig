package com.exception_handling_19_06_23;



	

public class ArrayException1 {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		try
		{
			
			System.out.println(a[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Done");
		
	}

}
