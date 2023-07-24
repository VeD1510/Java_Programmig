package com.assignment_3;

import java.util.Scanner;

public class NumGuss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No To Guess: ");
		int num = sc.nextInt();
		int guessNum;
		int count=0;
		
		while(true)
		{
			System.out.println("Guess My Number 1-25");
			guessNum = sc.nextInt();
			
			if(guessNum==num)
				break;
			
			if(guessNum>num)
				System.out.println("Plz Guess Lower No");
			else
				System.out.println("Plz Guess Higher No");
			count++;
						
		}
		
		System.out.println("Congo You Took "+count+" Attempts");
				

	}

}
