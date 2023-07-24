package com.arrays_09_06_23;

import java.util.Arrays;

public class CombineTwoArrays {
	
	
	public static void main(String[] args) {
		
		int a[]= {5,6,7,5};
		int b[]= {7,8,6,9};
		int c[]= new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int C=a.length;
		for(int i=0;i<b.length;i++)
		{
			c[C]=b[i];
			C++;
			
		}
		
		System.out.println(Arrays.toString(c));
	}

}
