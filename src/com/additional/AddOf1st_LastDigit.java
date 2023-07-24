package com.additional;

import java.util.Scanner;

public class AddOf1st_LastDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int num2=num;
		int count=0;
		
		while(num!=0)
		{
			num/=10;
			count++;
			
		}
		System.out.println((int)(num2%10)+(int)(num2/Math.pow(10, count-1)));  
		
	

	}

}
