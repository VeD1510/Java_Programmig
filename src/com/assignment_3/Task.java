package com.assignment_3;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pizzT = 0, pizz = 100;
		int puffT = 0, puff = 20;
		int cdT = 0, cd = 10;
		int in;
		
		Scanner sc = new Scanner(System.in);
		
		/*	System.out.println("Enter QTY Of Pizza:       ");
		int pizzB = sc.nextInt();
		
		System.out.println("Enter QTY Of Puffs:       ");
		int puffB = sc.nextInt();
		
		System.out.println("Enter QTY Of Cold Drinks: ");
		int cdB = sc.nextInt();
		
		if(pizzB>0) 
			pizzT = pizzB*pizz;
		
		if(puffB>0) 
			puffT = puffB*puff;
		
		if(cdB>0) 
			cdT = cdB*cd;
		
		int total = cdT+puffT+pizzT;
		System.out.println("-----------------------------------------------------------");
		System.out.println("Bill Ditails: ");
		System.out.println("                      Qty Price ");
		System.out.println("No Of Pizzas Bought:  "+pizzB+"   "+pizzT);
		System.out.println("No Of Puffs Bought:   "+puffB+"   "+puffT);
		System.out.println("No Of ColdD Bought:   "+cdB+  "   "+cdT);
		System.out.println("Total Bill For Order: "+total);
		System.out.println("-----------------------------------------------------------"); */
			
		do
		{
			System.out.println("Enter QTY Of Pizza:       ");
			int pizzB = sc.nextInt();
			
			System.out.println("Enter QTY Of Puffs:       ");
			int puffB = sc.nextInt();
			
			System.out.println("Enter QTY Of Cold Drinks: ");
			int cdB = sc.nextInt();
			
			if(pizzB>0) 
				pizzT = pizzB*pizz;
			
			if(puffB>0) 
				puffT = puffB*puff;
			
			if(cdB>0) 
				cdT = cdB*cd;
			
			int total = cdT+puffT+pizzT;
			System.out.println("-----------------------------------------------------------");
			System.out.println("Bill Ditails: ");
			System.out.println("                      Qty Price ");
			System.out.println("No Of Pizzas Bought:  "+pizzB+"   "+pizzT);
			System.out.println("No Of Puffs Bought:   "+puffB+"   "+puffT);
			System.out.println("No Of ColdD Bought:   "+cdB+  "   "+cdT);
			System.out.println("Total Bill For Order: "+total);
			System.out.println("-----------------------------------------------------------");
			
			System.out.println("Do YOu Want To Continue....(Y/N)");
			in = sc.next().charAt(0);
			
		}
		while(in=='Y' || in=='y');
		

	}

}
