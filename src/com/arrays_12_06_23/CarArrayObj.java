package com.arrays_12_06_23;

import java.util.Scanner;

public class CarArrayObj {
	
	int modelNo;
	String carName;
	int carPrice;
	
	public CarArrayObj(int modelNo,String carName,int carPrice) 
	{
		this.modelNo=modelNo;
		this.carName=carName;
		this.carPrice=carPrice;
		
		
		
	}
	public String toString()
	{
		return modelNo+" "+carName+" "+carPrice;
	}
	
	
	
	public static void main(String[] args) {
		
		CarArrayObj c[]= new CarArrayObj[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter Car Model No: ");
			int cModelNo=sc.nextInt();
			System.out.println();
		}
	}

}
