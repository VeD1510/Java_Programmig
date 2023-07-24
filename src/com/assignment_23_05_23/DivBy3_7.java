package com.assignment_23_05_23;

import java.util.Scanner;

public class DivBy3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		if(num%3==0)
			System.out.println(num+" Is Divisible By 3");
		else if(num%7==0)
			System.out.println(num+" Is Divisible By 7");
		else
			System.out.println(num+" Is Not Divisible By 3 And 7");
	
	}

}
