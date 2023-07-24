package com.arrays_09_06_23;

import java.util.Arrays;

public class SortEvenOdd {
	
	public static void sortEvenOdd(int a[])
	{

		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%2!=0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(a));
	
	}
	
	public static void main(String[] args) {
		
	int a[]= {2,9,5,6,7,8};
	SortEvenOdd.sortEvenOdd(a);
	}

}
