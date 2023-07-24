package com.assignment_23_05_23;

import java.util.Scanner;

public class DivBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		if(num%5==0)
			System.out.println(num+" Is Divisible By 5");
		else if(num%11==0)
			System.out.println(num+" Is Divisible By 11");
		else
			System.out.println(num+" Is Not Divisible By 5 And 11");
	
	}

}
