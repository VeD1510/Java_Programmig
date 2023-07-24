package com.basics;

import java.util.Scanner;

public class GradeCal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks:");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		int sub6 = sc.nextInt();
		int total = sub1+sub2+sub3+sub4+sub5+sub6;
		float per = total/6;
		
		if(per>=80)
		{
			System.out.println("The Grade Is : A+");
		}
		else if(per>=70)
		{
			System.out.println("The Grade is: A");
			
		}
		else if(per>=60)
		{
			System.out.println("The Grade is: B+");
		}
		else if(per>=50)
		{
			System.out.println("The Grade Is: B");
		}
		else if(per>=40)
		{
			System.out.println("The Grade is: C+");
		}
		else if(per>=35)
		{
			System.out.println("The Grade is: C");
		}
		else
		{
			System.out.println("Fail!");
		}
		
	}

}
