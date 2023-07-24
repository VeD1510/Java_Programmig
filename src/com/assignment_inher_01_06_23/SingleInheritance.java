package com.assignment_inher_01_06_23;

class ShoeBrand {
	
	int brandId;
	String brandName;
	
}

class Nike extends ShoeBrand{
	
	public void showDetails(int brandId,String brandName)
	{
		this.brandId = brandId;
		this.brandName = brandName;
		System.out.println("Brand ID   : "+brandId);
		System.out.println("Brand Name : "+brandName);
	}
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		
		Nike n = new Nike();
		n.showDetails(101, "Nike");
	}
	
	

}
