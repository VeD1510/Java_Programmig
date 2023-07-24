package com.assignment_3;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num = sc.nextInt();
		int flag=0;
		
		for(int i=2;i<num;i++) 
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(num+" Is Prime Num");
		else
			System.out.println(num+" Is Not Prime");
	}

}
