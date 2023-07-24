package com.assignment_23_05_23;

import java.util.Scanner;

public class CheckDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Thrusday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saurday");
		break;
		}
	}

}
