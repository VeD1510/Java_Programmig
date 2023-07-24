package com.basics;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal & Time & Rate");
		int principal =sc.nextInt();
		int time = sc.nextInt();
		int rate = sc.nextInt();
		double simpleInterest = (principal*time)*rate/100;
		
		System.out.println("Simple Interest : "+simpleInterest);
	}

}
