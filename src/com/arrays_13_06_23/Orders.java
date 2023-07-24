package com.arrays_13_06_23;

import java.util.Scanner;

// Create Array of orders order has orderId,custName,orderQty,orderStatus create a array bye using 
// getter setter first display all the orders ,Display only orders whose Qty is more than 2.

public class Orders {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DisplayOrders[]o=new DisplayOrders[3];
		
		for(int i=0;i<o.length;i++)
		{
			System.out.println("Enter Order ID: ");
			int id=sc.nextInt();
			System.out.println("Enter Customer Name: ");
			String name=sc.next();
			System.out.println("Enter Order Qty: ");
			int qty=sc.nextInt();
			System.out.println("Enter Order Status: ");
			String stat=sc.next();
			
			DisplayOrders od = new DisplayOrders();
			od.setOrderId(id);
			od.setCustName(name);
			od.setOrderQty(qty);
			od.setOrderStatus(stat);
			o[i]=od;
					
			
		}
		for(DisplayOrders od : o)
		{
			System.out.println(od.getOrderId()+" "+od.getCustName()+" "+od.getOrderQty()+" "+od.getOrderStatus());
		}
		System.out.println("______________________________________________________");
		for(DisplayOrders od : o)
		{
			if(od.getOrderQty()>2)
			{
				System.out.println(od.getOrderId()+" "+od.getCustName()+" "+od.getOrderQty()+" "+od.getOrderStatus());
			}
		}
		
	}
}
 class DisplayOrders
{
	 
	 private int orderId;
		private String custName;
		private int orderQty;
		private String orderStatus;

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public int getOrderId() {
			return orderId;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public String getCustName() {
			return custName;
		}

		public int getOrderQty() {
			return orderQty;
		}

		public void setOrderQty(int orderQty) {
			this.orderQty = orderQty;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		


}
