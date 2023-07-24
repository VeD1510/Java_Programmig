package com.assignment_3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  Number: ");
		int num = sc.nextInt();
		System.out.println("Enter Your Lucky Digit :  ");
		int dig = sc.nextInt();
		
		int r,count=0;
		
		while(num!=0)
		{
			r = num%10;
			
			if(r==dig)
				count++;
			
			num = num/10;
			
		}
		
		System.out.println("Lucky Digit Repeated "+count+" Times");

	}

}
