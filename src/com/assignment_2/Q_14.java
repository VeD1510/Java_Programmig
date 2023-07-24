package com.assignment_2;

import java.util.Scanner;

public class Q_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int milk = 40;
		int oil = 50;
		int sum = 0;
		int totalQtyMilk = 0;
		int totalQtyOil =0;
		
		while(true)
		{
			int qtyMilk;
			System.out.println("Enter QTY of Milk");
			qtyMilk = sc.nextInt();
			totalQtyMilk = totalQtyMilk+qtyMilk;
			
			int qtyOil;
			System.out.println("Enter QTY Of Oil");
			qtyOil = sc.nextInt();
			totalQtyOil = totalQtyOil+qtyOil;
			
			sum = sum+(milk*qtyMilk+oil*qtyMilk);
			
			if(sum>500)
				break;
			
		}
		System.out.println("QTY Entered For Milk: "+totalQtyMilk);
		System.out.println("QTY Entered For Oil: "+totalQtyOil);
		
				

	}

}
