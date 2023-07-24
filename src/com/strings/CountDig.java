package com.strings;

public class CountDig {
	
	public static void digCount(String str)
	{
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='1' && ch[i]<='9')
			{
				count++;
			}
		}
		System.out.println(count);
	}

	
	public static void main(String[] args) {
		
		String st = "1254";
		digCount(st);
	}
}
