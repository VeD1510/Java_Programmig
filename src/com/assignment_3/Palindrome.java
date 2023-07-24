package com.assignment_3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int num2 = num;
		int r;
		int sum = 0;
		
		while(num!=0)
		{
			r = num%10;
			sum = sum*10+r;
			num = num/10;
			
		}
		
		if(sum==num2)
			System.out.println(num2+" Is Palindrome");
		else
			System.out.println(num2+" Is Not Palindrome");


	}

}
