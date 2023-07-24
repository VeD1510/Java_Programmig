package com.additional;

import java.util.Scanner;

public class Series_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num Terms: ");
		int num = sc.nextInt();
		int sum=1;
		
		for(int i=1;i<=num;i++)
		{
			sum=sum*10+1;			
			System.out.println(sum);
		}

	}

}
