package com.assignment_1;

import java.util.Scanner;

/*  3. Write a Java program to input electricity consumption unit and calculate totalelectricity billaccording to the given 
condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit 
above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill   */


public class ElectBill {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter consumed Units");
		int unit = sc.nextInt();
		float sur, billAmt, amt;
		
		if(unit<=50)
		{
			amt = unit*0.50f;
		}
		else if(unit<=150)
		{
			amt = unit*0.75f;
		}
		else if(unit<=250)
		{
			amt = unit*1.20f;
		}
		else
		{
			amt =unit*1.50f;
		}
		
		sur = amt*0.20f;
		billAmt = sur+amt;
		
		System.out.println("Total Electricity Bill : "+billAmt);
		
	}

}
