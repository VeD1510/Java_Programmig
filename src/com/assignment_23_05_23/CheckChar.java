package com.assignment_23_05_23;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		if(ch>'a' && ch<'z' || ch>'A' && ch<'Z')
			System.out.println("Character Entered Is Alphabate");
		else if(ch>'1' && ch<'9')
			System.out.println("Character Entered Is Digit");
		else
			System.out.println("Symbol");
	
	}

}
