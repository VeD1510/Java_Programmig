package com.assignment_3;

import java.util.Scanner;

public class MaxDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int max=0;
		int r;
		
		while(num!=0)
		{
			r=num%10;
			
			if(r>max)
				max=r;
			
			num=num/10;
		}
		System.out.println("MAX DIGIT IS: "+max);

	}

}
