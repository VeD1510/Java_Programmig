package com.assignment_1;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter any Alphabet");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch+": This Alphabet is Vowel");
		}
		
		else {
			System.out.println(ch+": This Alphabet is Consonent");
		}

	}

}
