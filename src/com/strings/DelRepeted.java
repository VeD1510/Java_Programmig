package com.strings;

import java.util.Scanner;

public class DelRepeted {
	
	public static void delRepeated(String str)
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word TO Delete");
		
		String s=sc.next();
		String s1="";
		String st[]=str.split(" ");
		for(int i=0;i<st.length;i++)
		{
			if(!st[i].equalsIgnoreCase(s))
			{
				s1=s1+st[i]+" ";
			}
			
		}
		System.out.println(s1);
		
	}
	
	public static void main(String[] args) {
		
		String str="java java sdsfs core ";
		delRepeated(str);
	}

}
