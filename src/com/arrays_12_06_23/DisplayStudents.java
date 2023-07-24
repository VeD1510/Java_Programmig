package com.arrays_12_06_23;

import java.util.Scanner;

public class DisplayStudents {
	
	
	
		int id;
		String name;
		int per;
		
		public DisplayStudents(int id,String name,int per)
		{
			this.id=id;
			this.name=name;
			this.per=per;
			
		}
		public String toString()
		{
			return id+" "+name+" "+per;
		}
	
	public static void main(String[] args) {
		
		DisplayStudents s[]=new DisplayStudents[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter SID: ");
			int sid=sc.nextInt();
			System.out.println("Enter Name: ");
			String sname=sc.next();
			System.out.println("Enter Per: ");
			int sper=sc.nextInt();
			
			s[i]=new DisplayStudents(sid,sname,sper);
			
		
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("...........................................");
		System.out.println("Students Who Scored More Than 60");
		for(int i =0;i<s.length;i++)
		{
			if(s[i].per>=60)
			{
				System.out.println(s[i]);
			}
		}
		
		
		
	}

}
