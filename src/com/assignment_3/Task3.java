package com.assignment_3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Nth Birthday");
		int num = sc.nextInt();
		int a =0;
		for(int i=1;i<=num;i++)
		{
			 a = i*i*i;
		}
		System.out.println(a+" Gold Coins");

	}

}
