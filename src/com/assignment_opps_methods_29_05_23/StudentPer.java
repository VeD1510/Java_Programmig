package com.assignment_opps_methods_29_05_23;

public class StudentPer {
	
	int sid;
	String name;
	int sub1,sub2,sub3;
	int result;
	public void acceptDetails(int sid,String name,int sub1,int sub2,int sub3)
	{
		this.sid=sid;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
	}
	
	public double calPer()
	{
		this.result = (sub1+sub2+sub3)/3;
		return result;
	}
	
	public void calGrade()
	{
		if(result>=90)
			System.out.println("A+ Grade");
		else if(result>=80)
			System.out.println("A Grade ");
		else if(result>=70)
			System.out.println("B+ Grade ");
		else if(result>=60)
			System.out.println("B Grade ");
		else if(result>=50)
			System.out.println("C+ Grade ");
		else if(result>=40)
			System.out.println("C Grade ");
		else
			System.out.println("FAIL!");
	}
	

	public static void main(String[] args) {
		
		StudentPer s1 = new StudentPer();
		s1.acceptDetails(101, "VedanG", 70, 80, 90);
		System.out.println(s1.sid+"  "+s1.name+"  "+s1.sub1+"  "+s1.sub2+"  "+s1.sub3);
		System.out.println("Percentage Scored: "+s1.calPer());
		s1.calGrade();

	}

}
