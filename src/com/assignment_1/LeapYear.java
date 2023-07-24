package com.assignment_1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		 int year = sc.nextInt();
		 
		 if( year%4==0 && (year % 100 != 0 || year % 400 == 0))
		 {
			 System.out.println(year+" This Is Leap Year");
		 }
		 else
			 System.out.println(year+" Not a Leap Year");
	}

}
