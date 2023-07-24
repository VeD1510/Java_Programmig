package com.assignment_24_05_23;

import java.util.Scanner;

public class TableOfNum {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+num*i);
		}

	

	}

}
