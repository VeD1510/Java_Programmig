package com.assignment_1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
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
