package com.assignment_2;

import java.util.Scanner;

public class AutomorphicNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int num2=num;
		int count=0;
		int squr;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		squr=num2*num2;
		int lastDigit=(int)(squr%(Math.pow(10,count)));
		
		if(num2==lastDigit)
			System.out.println(num2+" Is Automorphic");
		else
			System.out.println(num2+" Is Not Automorphic");
		
		System.out.println("Square: "+squr);
		System.out.println("LastDigit: "+lastDigit);
		
		

	}

}
