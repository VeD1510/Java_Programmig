package com.assignment_opps_30_05_23;

public class BankAccountInfo {
	
	public static void main(String[] args) {
		
		BankGetterSetter b1 =new BankGetterSetter();
		b1.setAccNo(1236456);
		b1.setCustName("VedanG JahagirdaR");
		b1.setAccType("Saving");
		b1.setAccBal(100000);
		
		System.out.println("Account No       :"+b1.getAccNo());
		System.out.println("Account Name     :"+b1.getCustName());
		System.out.println("Account Type     :"+b1.getAccType());
		System.out.println("Available Balance:"+b1.getAccBal());
	}

}
