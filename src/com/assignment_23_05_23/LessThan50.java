package com.assignment_23_05_23;

import java.util.Scanner;

public class LessThan50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		if(num<50)
			System.out.println("Num is less than 50");
	}

}
