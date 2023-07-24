package com.assignment_3;

import java.util.Scanner;

public class MinNotes {
	public static void main(String[] args) {
		
		int  n2000=0, n500=0, n200=0, n100=0, n50=0, n20=0, n10=0, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary Amount");
		int num = sc.nextInt();
		
		while(num>=2000)
		{
			r=num%2000;
			n2000++;
			num = num-2000;
		}
		
		while(num>=500)
		{
			r=num%500;
			n500++;
			num = num-500;
		}
		
		while(num>=200)
		{
			r=num%200;
			n200++;
			num = num-200;
		}
		
		while(num>=100)
		{
			r=num%100;
			n100++;
			num = num-100;
		}
		
		while(num>=50)
		{
			r=num%50;
			n50++;
			num = num-50;
		}
		
		while(num>=20)
		{
			r=num%20;
			n20++;
			num = num-20;
		}
		
		while(num>=10)
		{
			r=num%10;
			n10++;
			num = num-10;
		}
		
		System.out.println("2000 : "+n2000);
		System.out.println("500  : "+n500);
		System.out.println("200  : "+n200);
		System.out.println("100  : "+n100);
		System.out.println("20   : "+n20);
		System.out.println("10   : "+n10);
		
		
	}

}
