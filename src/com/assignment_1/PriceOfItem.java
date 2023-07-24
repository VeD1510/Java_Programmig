package com.assignment_1;

import java.util.Scanner;

public class PriceOfItem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item: ");
		String item = sc.next();
		System.out.println("Enter Qty For "+item);
		int qty = sc.nextInt();
		System.out.println("Enter Price For "+item);
		int price = sc.nextInt();
		int bill = qty*price;
		
		System.out.println("Price Of "+item+ " Is "+bill+ " For "+ qty+ " Qty");
		
	}

}
