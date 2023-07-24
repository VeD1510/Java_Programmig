package com.strings;

public class VowelCap {
	
	public static void main(String[] args) {
		
		String str="I like Java";
		
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				ch[i]=(char)(ch[i]+32);
			}
			System.out.print(ch[i]);
		}
		
	}

}
