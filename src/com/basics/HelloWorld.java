package com.basics;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		int num = 1, num2 = 2, sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(num + " " + num2);

		for (int i = 1; i <=n; i++) {
			sum = num + num2;
			System.out.print(" "+ num + " " + sum);
			num = num2;
			num2 = sum;
		}

	}

}
