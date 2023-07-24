package com.assignment_23_05_23;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number Is Even");
		}
		else
		{
			System.out.println("Number Is Odd");
		}


	}

}
