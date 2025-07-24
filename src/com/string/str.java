package com.string;

public class str {

	public static void main(String[] args) {
		String str1="reeba";
		String a="";
      
         for(int i=str1.length()-1; i>=0;i--) {
          a+=str1.charAt(i);
         }
         System.out.println("reverse:" + a);
         
	}

}
