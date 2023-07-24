package com.arrays_13_06_23;

import java.util.Scanner;

/*Create Student class student has studId,sName and object of course ,course has 
    cId,cName,cFees, using getter setter display all the student details.*/

public class DisplayStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stud[]=new Student[3];
		for(int i=0;i<stud.length;i++)
		{
			System.out.println("Enter Student ID: ");
			int id=sc.nextInt();
			System.out.println("Enter Student Name: ");
			String name=sc.next();
			System.out.println("Enter Course ID: ");
			int cid=sc.nextInt();
			System.out.println("Enter Course Name: ");
			String cname=sc.next();
			System.out.println("Enter Course Fees: ");
			int cfees=sc.nextInt();
			
			Student st = new Student();
			st.setStudId(id);
			st.setStudName(name);
			st.setC(new Course());
			st.c.setcId(cid);
			st.c.setcName(cname);
			st.c.setcFees(cfees);
			
			stud[i]=st;
			
			
			
		}
		
		for(int i=0;i<stud.length;i++)
		{
			System.out.println(stud[i].getStudId()+" "+stud[i].getStudName()+" "+stud[i].getC().getcId()+" "
		     +stud[i].getC().getcName()+" "+stud[i].getC().getcFees());
		}
		
	}
	

}

class Student
{
	int studId;
	String studName;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	Course c;
}

class Course
{
	int cId;
	String cName;
	int cFees;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcFees() {
		return cFees;
	}
	public void setcFees(int cFees) {
		this.cFees = cFees;
	}
}


