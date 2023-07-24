package com.strings;

public class DivideString {
	
	public static void split(String a)
	{
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
            count++;

            
            
            if (count % 2 == 0) {
                System.out.println();
                count=0;
            }
        }
	}
	
	public static void main(String[] args) {
		
		 String a = "aaaabbbbcccc";
		 DivideString.split(a);
	}        

}
