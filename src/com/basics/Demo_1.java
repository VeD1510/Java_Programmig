package com.basics;

import java.util.Scanner;

		//WC area of rectangle
		//WC cube
		//WC area of triangle

public class Demo_1 {
	
	Scanner sc = new Scanner(System.in);
	
	public int areaOfRec(int length , int breadth) {
		
		return length*breadth;
	}
	
	public int cube(int num) {
		
		return num*num*num;
	}
	public static void main(String[] args) {
		
		Demo_1 d = new Demo_1();
		
		int a=d.cube(4);
		int b=d.areaOfRec(2, 2);
		
		System.out.println(b);
	
		
		

	}

}

