package com.assignment_3;

import java.util.Scanner;

public class AmstrongNum
{
	public static void ArmStr(int Num) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Num: ");
		int num = Num ;//
		int num2 = num;
		int sum =0;
		int r;
		
		while(num!=0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		
		if(num2==sum)
			System.out.println(num2+" Is Armstrong");
		else
			System.out.println(num2+" Is Not Armstrong");

	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num = sc.nextInt();
		int num2 = num;
		int sum =0;
		int r;
		
		while(num!=0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		
		if(num2==sum)
			System.out.println(num2+" Is Armstrong");
		else
			System.out.println(num2+" Is Not Armstrong");*/
		
		ArmStr(365);
		

	}

}
