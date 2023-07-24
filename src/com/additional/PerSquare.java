package com.additional;

import java.util.Scanner;

public class PerSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(i*i);
		}

	}

}
