package com.assignment_inher_01_06_23;


class CarSpeed
{
	String carName;
	int carSpeed;
}

class Audi extends CarSpeed
{
	int carSpeed = 200;
	String carName="Audi";

}

class Q7 extends Audi
{
	String carName = "Q7";
	int carSpeed = 140;
	
	public void show()
	{
		System.out.println("Audi Max Speed : "+super.carSpeed);
		System.out.println("Car Name       : "+carName);
		System.out.println("Car Speed      :  "+carSpeed);
	}
}

public class MultipleInheritance {
	
	public static void main(String[] args) {
		
		Q7 q = new Q7();
		q.show();
	
	}
	
}
