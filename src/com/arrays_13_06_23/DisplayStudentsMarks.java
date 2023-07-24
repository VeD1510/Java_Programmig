package com.arrays_13_06_23;

import java.util.Arrays;
import java.util.Scanner;

//Create array of student which has id ,name and int type of marks array.create an array and display it



public class DisplayStudentsMarks 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student1 stud[]=new Student1[3];
		
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter Student ID: ");
			int id=sc.nextInt();
			System.out.println("Enter Student Name: ");
			String name=sc.next();
			System.out.println("Enter Subs: ");
			int subs=sc.nextInt();
			int []m =new int[subs];
			for(int j=0;j<subs;j++)
			{
				System.out.println("Enter Marks: ");
				m[j]=sc.nextInt();
			}
			stud[i]=new Student1(id,name,m);
		}
		System.out.println("....................................................");
		
		
		for(int i=0;i<stud.length;i++)
		{
			System.out.println(stud[i]);
		}
		

	}
}

class Student1
{
	int sId;
	String sName;
	int[] sMarks;
	
	public Student1(int sId,String sName,int[] sMarks) {
		this.sId=sId;
		this.sName=sName;
		this.sMarks=sMarks;
	}
	
	public String toString()
	{
		return sId+" "+sName+" "+Arrays.toString(sMarks); 
	}
}
