package com.assignment_23_05_23;

import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No: ");
		int num = sc.nextInt();
		
		switch(num%2)
		{
		case 0:
			System.out.println(num+" Is Even");
			break;
		case 1:
			System.out.println(num+" Is Odd");
			break;
		}

	
	}

}
