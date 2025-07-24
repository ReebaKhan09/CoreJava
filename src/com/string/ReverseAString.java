package com.string;

public class ReverseAString {

	public static void main(String[] args) {
		String s="khan";
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0;i--) {
			rev=rev+s.charAt(i);
		}
         System.out.println("reverse string :"+rev);
	}


}
