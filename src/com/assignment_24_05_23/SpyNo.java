package com.assignment_24_05_23;

import java.util.Scanner;

public class SpyNo {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int num2 = num;
		int r;
		int sum = 0,mult=1;
		
		while(num!=0)
		{
			r = num%10;
			sum = sum+r;
			mult = mult*r;
			
			num = num/10;
			
		}
		
		if(sum==mult)
			System.out.println("Num Is Spy");
		else
			System.out.println("Not a Spy No.");
		
	

	

	}

}
