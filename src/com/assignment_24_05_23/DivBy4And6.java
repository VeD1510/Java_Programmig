package com.assignment_24_05_23;

import java.util.Scanner;

public class DivBy4And6 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Num: ");
		//int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i%4==0 || i%6==0)
				break;
			
			
		}

	

	}

}
