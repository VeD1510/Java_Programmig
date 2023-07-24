package com.assignment_3;

import java.util.Scanner;

public class Task2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rs: ");
		int rs = sc.nextInt();
		int sum = 0, count = 0;
		
		for(int i=0;i<rs;i++)
		{
			count++;
			if(count%3==0)
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
