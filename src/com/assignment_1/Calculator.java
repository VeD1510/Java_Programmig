package com.assignment_1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        double num1 = scanner.nextDouble();
	        double num2 = scanner.nextDouble();
	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);
	        double result;
	        if (operator == '+')
	        {
	            result = num1 + num2;
	        } 
	        else if (operator == '-')
	        {
	            result = num1 - num2;
	        } 
	        else if (operator == '*')
	        {
	            result = num1 * num2;
	        } 
	        else if (operator == '/')
	        {
	            result = num1 / num2;
	        }
	        else
	        {
	            System.out.println("Invalid operator");
	            return;
	        }
	        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}

}
