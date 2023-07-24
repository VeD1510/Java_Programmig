package com.assignment_opps_methods_29_05_23;

public class Account {
	
	long accNo;
	String custName;
	
//	public Account()
//	{
//		this.accNo = 14588456;
//		this.custName = "VedanG JahagirdaR";
//		System.out.println("In Default Constructor...");
//	}
	
	public Account(long accNo,String custName)
	{
		this.accNo = accNo;
		this.custName = custName;
		System.out.println("In Parametarised Constructor");
	}

	public static void main(String[] args) {
		
		//Account a1 = new Account();
		//System.out.println(a1.accNo+"   "+a1.custName);
		
		Account a2 = new Account(14556698, "JHfsjhf kjsdfhkjs");
		System.out.println(a2.accNo+"   "+a2.custName);
		
		
		
		
		

	}

}
