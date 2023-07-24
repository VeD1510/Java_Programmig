package com.additional;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num = sc.nextInt();
		int n1=0,n2=1,sum=0;
		
		for(int i=1;i<=num;i++)
		{
			sum=n1+n2;
			n1=sum;
			n2=i;
			System.out.println(sum);
		}

	}

}
