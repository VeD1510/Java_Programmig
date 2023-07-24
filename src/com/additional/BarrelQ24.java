package com.additional;

import java.util.Scanner;

public class BarrelQ24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Qty Of Barrel: ");
		int bar = sc.nextInt();
		
		if(bar>10)
		{
			System.out.println("Price Of" +bar+ " barrel is: "+bar*(89-bar));
		}
		else
			System.out.println("Price Of" +bar+ " barrel is: "+bar*(89));

	}

}
