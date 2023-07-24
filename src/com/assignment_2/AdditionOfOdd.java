package com.assignment_2;

import java.util.Scanner;

public class AdditionOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n, sum = 0;
		System.out.println("Enter no");
		n = sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			
			
		}
		System.out.println("Addition Is: "+sum);

	}

	

}
