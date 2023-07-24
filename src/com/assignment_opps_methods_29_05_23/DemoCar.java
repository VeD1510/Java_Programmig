package com.assignment_opps_methods_29_05_23;

public class DemoCar {
	
	int carModel;
	String carName;
	double carPrice;
	
	public static void main(String[] args) {
		
		DemoCar c1 = new DemoCar();
		c1.carModel=101;
		c1.carName="BMW X7";
		c1.carPrice=3000000;
		
		DemoCar c2 = new DemoCar();
		c2.carModel=102;
		c2.carName="Aston Martin";
		c2.carPrice=30255000;
		
		DemoCar c3 = new DemoCar();
		c3.carModel=103;
		c3.carName="Audi R8";
		c3.carPrice=3253300;
		
		System.out.println("Model No"+"\t"+"Car Name"+"\t"+"Car Price");
		System.out.println(c1.carModel+"\t\t"+c1.carName+"\t\t"+c1.carPrice);
		System.out.println(c2.carModel+"\t\t"+c2.carName+"\t\t"+c2.carPrice);
		System.out.println(c3.carModel+"\t\t"+c3.carName+"\t\t"+c3.carPrice);
	}

}
