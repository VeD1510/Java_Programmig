package com.assignment_opps_methods_29_05_23;

public class Shopping {
	
	int prodId;
	String prodName;
	int prodQty,prodPrice,prodBill;
	
	public Shopping(int prodId,String prodName,int prodQty,int prodPrice)
	{
		this.prodId=prodId;
		this.prodName=prodName;
		this.prodQty=prodQty;
		this.prodPrice=prodPrice;
	}
	
	public void calBill()
	{
		if(prodQty>0)
		{
			prodBill=prodQty*prodPrice;
			this.dispDetails();
		}
		else
			System.err.println("Error...");
		
		
	}
	
	public void dispDetails()
	{
		System.out.println("ID"+"  "+"ProductName"+"  "+"QTY"+"  "+"Price"+"  "+"TotalBill");
		System.out.println(prodId+"     "+prodName+"       "+prodQty+"    "+prodPrice+"     "+prodBill);
	}

	public static void main(String[] args) {
		
		Shopping s1 = new Shopping(101,"Pen", 0,5);
		s1.calBill();
	}

}
