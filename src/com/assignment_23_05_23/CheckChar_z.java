package com.assignment_23_05_23;

import java.util.Scanner;

public class CheckChar_z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		char ch = sc.next().charAt(0);
		
		if(ch=='z')
			System.out.println("Char Is z");
	}

}
