package com.assignment_2;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No: ");
		int num = sc.nextInt();
		int dig, product=1;
		
		while(num!=0)
		{
			dig=num%10;
			product=product*dig;
			num=num/10;
			
		}
		
		System.out.println("Product Of Digits Is: "+product);
	}

}
