package com.arrays_09_06_23;

import java.util.Arrays;

public class ReplaceEven {
	
	public static void replaceEven(int a[])
	{
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				a[i]=1;
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		
		int a[]= {2,4,5,7,8};
		ReplaceEven.replaceEven(a);
	}

}
