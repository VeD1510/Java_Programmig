package com.assignment_1;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Month Number");
		int month=sc.nextInt();
		
		if(month==1 || month==3 ||month==5 ||month==7 || month==8 || month==9 || month==10 || month==12)
		{
			System.out.println(month+" : This month 31 days");
		}
		else if(month==4 ||month==6||month==11)
		{
			System.out.println(month+": This month 30 days");
		}
		
		else if(month==2)
		{
			System.out.println(month+": This month 29/28 dyas");
		}
		
		else
		{
			System.out.println("Invalid Month");
		}

	}

}
