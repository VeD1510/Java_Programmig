package com.arrays_09_06_23;

import java.util.Arrays;

public class SortChar {
	
	public static void sortChar(char c[])
	{
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<c.length;i++)
		{
			
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}
	
	public static void main(String[] args) {
		char c[]= {'a','r','t','d','e','A'};
		SortChar.sortChar(c);
	}

}
