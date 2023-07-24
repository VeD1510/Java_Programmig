package com.assignment_23_05_23;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		if(ch>'a' && ch<'z')
			System.out.println("Character Entered Is LowerCase");
		else if(ch>'A' && ch<'Z')
			System.out.println("Character Entered Is UpperCase");
		
	}

}
