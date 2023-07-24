package com.exception_handling_19_06_23;


class ContainsDigit extends Exception
{
	public ContainsDigit()
	{
		super();
	}
	public ContainsDigit(String str)
	{
		super("str");
	}
	
}
public class StringCheck {
	
	public static void stringCheck(String str) throws ContainsDigit
	{
		boolean isDigit= false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=0 && str.charAt(i)!=9)
			{
				isDigit=true;
				throw new ContainsDigit("String Contains Char");
			}
		}
		int sum=0;
		int sum1=0;
		int j=str.length()-1;
		
		
		if(isDigit==false)
		{
			for(int i=0;i<=2;i++)
			{
				sum=sum+str.charAt(i);
				sum1=sum1+str.charAt(j);
				j--;
			}
			System.out.println(sum+"  "+sum1);
		}
	}
	public static void main(String[] args) {
		
		String str="123";
		try {
			StringCheck.stringCheck(str);
		} catch (ContainsDigit e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
