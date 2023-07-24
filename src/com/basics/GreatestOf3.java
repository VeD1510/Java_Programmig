package com.basics;

public class GreatestOf3 {
	
	public static void main(String[] args) {
		
int num1=40, num2=60, num3=89;
int greatest=num1;
		
		if(num2>greatest)
		{
			greatest=num2;
		}
		if(num3>greatest)
		{
			greatest=num3;
		}
		
		System.out.println(greatest);
	}

}
