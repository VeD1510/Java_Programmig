package com.strings;

public class Last3Addn {
	
	public static void main(String[] args) {
		
		String str = "1222124";
		
		int l = str.length()-1;
		int sum=0;
		for(int i=0;i<3;i++)
		{
			//sum=sum  +  (str.charAt(l)-48);
			sum=sum+Character.getNumericValue(str.charAt(l));
		    System.out.println(	str.charAt(l));
		    l--;
		 
		}
		System.out.println(sum);
		
				
	}

}
