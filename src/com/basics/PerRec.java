package com.basics;

import java.util.Scanner;

public class PerRec {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length & Breadth Of Rectangle");
		int length =sc.nextInt();
		int breadth = sc.nextInt();
		
		System.out.println("Perimeter Of Rectangle Is : "+2*(length*breadth));
	}

}
