package com.assignment_25_05_23;

import java.util.Scanner;

public class FreqOfDigit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Number\tFrequency");
		int digit, i;
		for (i = 0; i <= 9; i++) {
			int count = 0;
			int temp = num;

			while (temp != 0) {
				digit = temp % 10;
				if (digit == i)
					count++;
				temp = temp / 10;

			}

			if (count > 0)

				System.out.println(i + "\t" + count);
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the number: ");
//		int num = sc.nextInt();
//		int num2=num;
//		int temp=num;
//		int r;
//		int count=0;
//		
//		while(num!=0)
//		{
//			
//			count=0;
//			int dig;
//			r=num%10;
//			
//			while(temp!=0)
//			{
//				num=num2;
//				dig=temp%10;
//				if(r==dig)
//				{
//					count++;
//				}
//				temp=temp/10;
//			}
//			System.out.println(r+"   "+count);
//			num=num/10;
//			
//		}
//		System.out.println(temp);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
//		}
	}
}
