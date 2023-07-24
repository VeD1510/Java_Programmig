package com.assignment_2;

import java.util.Scanner;

public class KrishnaMurthyNo {
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		int num2=num;
		int sum = 0;
		int dig;
		
		while(num!=0)
		{
			int fact = 1;
			dig=num%10;
			
			for(int i=1;i<=dig;i++)
			{
				fact=fact*i;
				
			}
			
			sum+=fact;
			num/=10;
				
			
		}
		if(sum==num2)
			System.out.println(num2+" Is KrushMurthy");
		else
			System.out.println("NA");
		
		}

}
