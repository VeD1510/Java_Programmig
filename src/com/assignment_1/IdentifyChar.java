package com.assignment_1;

import java.util.Scanner;

public class IdentifyChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value: ");
		char ch = sc.next().charAt(0);
		
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("This is a Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("This is a Number");
		}
		else
		{
			System.out.println("This is a Special Character");
		}
		
		

	}

}
