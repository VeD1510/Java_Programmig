package com.strings;

class DupliChaar
{
	public static void dupliChar(String str)
	{
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				
				if(ch[i]=='\0')
					continue;
				
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			if(count>1)
			System.out.println(ch[i]);
		}
	}
}

public class DupliChar {
	
	public static void main(String[] args) {
		String st = "asdasdajjs";
		DupliChaar.dupliChar(st);
	}
}
