package com.assignment_23_05_23;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		if(num>0)
			System.out.println(num+" Is Positive");
		else if(num<0)
			System.out.println(num+" Is Negative");
		else
			System.out.println(num+" Is 0");
	
	}

}
