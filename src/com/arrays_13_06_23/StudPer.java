package com.arrays_13_06_23;

import java.util.Arrays;
import java.util.Scanner;

public class StudPer {
	public static void main(String[] args) {
		
		float per=0;
		Scanner sc = new Scanner(System.in);
		StudDetails s[]=new StudDetails[2];
		for(int i=0;i<s.length;i++)
		{
			float sum=0;
			System.out.println("Enter Student ID: ");
			int id=sc.nextInt();
			System.out.println("Enter Student Name: ");
			String name=sc.next();
			
			
			int marks[]=new int[5];
			for(int j=0;j<marks.length;j++)
			{
				System.out.println("Enter MArks");
				marks[j]=sc.nextInt();
				sum=sum+marks[j];
				per=(sum/500)*100;
				
			}
			
			s[i]=new StudDetails(id, name, marks,per);
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
//		for(int i=0;i<s.length;i++)
//		{
//			System.out.println(s[i].sId+" "+s[i].sName);
//			for(int k=0;k<s[i].marks.length;k++)
//			{
//				sum=sum+s[i].marks[k];
//				float per=sum/5;
//			}
//		}
		
		
		
		
	}
	

}

class StudDetails
{
	int sId;
	String sName;
	int marks[];
	float per;
	
	
	public StudDetails(int sId,String sName,int marks[],float per)
	{
		this.sId=sId;
		this.sName=sName;
		this.marks=marks;
		this.per=per;
		
	}
	
	public String toString()
	{
		return sId+" "+sName+" "+Arrays.toString(marks)+" "+per;
	}
	
}