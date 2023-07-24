package com.assignment_3;

import java.util.Scanner;

public class SumOfDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int sum=0;
		int r;
		
		while(num!=0)
		{
			r=num%10;
			
			sum=sum+r;
			
			num=num/10;
		}
		System.out.println("SUM OF DIGITS: "+sum);

	}

}
