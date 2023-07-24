package com.assignment_23_05_23;

import java.util.Scanner;

public class CheckPerYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percentage: ");
		double per = sc.nextDouble();
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		
		if(per>60)
		{
			if(year==2021)
				System.out.println("Eligible For Interview");
			else
				System.out.println("Not Eligible Passing Year Required 2021");
		}
		else
			System.out.println("Percentage Criteria Not Satisfied");

	
	}

}
