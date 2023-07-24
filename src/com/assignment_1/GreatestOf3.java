package com.assignment_1;

import java.util.Scanner;

public class GreatestOf3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int greatest = num1;
		
		if(num2>greatest)
		{
			greatest=num2;
		}
		if(num3>greatest)
		{
			greatest=num3;
		}
		
		System.out.println(greatest);
	}

}
