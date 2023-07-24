package com.arrays_09_06_23;

public class SumOfAlternate {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
	
		int sum=0;
		
		for(int i=0;i<a.length/2;i++)
		{
			int b=a[a.length-1-i];
			
			sum=a[i]+b;
			System.out.println(sum);
			
			
			
			
			
		}
		
		
	}

}
