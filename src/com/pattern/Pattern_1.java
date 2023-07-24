package com.pattern;

public class Pattern_1 {


	
	

	public static void main(String[] args) {
		
		P2();
	}
	
	public static void P_1()
	{
		
//		 * 
//		 *  * 
//		 *  *  * 
//		 *  *  *  * 
//		 *  *  *  *  * 

		int num=1;
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
				
			}
			System.out.println();
			
		}
		
	
	}
	
	public static void P2()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || j==1|| j==4 || i==4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
