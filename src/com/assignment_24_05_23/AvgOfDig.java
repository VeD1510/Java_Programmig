package com.assignment_24_05_23;

import java.util.Scanner;

public class AvgOfDig {

	public static void main(String[] args) {


		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num = sc.nextInt();
		int sum=0,rem,count=0;
		for(;;)
		{
			if(num==0)
				break;
			
			rem=num%10;
			sum+=rem;
			num/=10;
			count++;
						
		}
		
		System.out.println("Avg: "+sum/count);

	

	

	}

}
