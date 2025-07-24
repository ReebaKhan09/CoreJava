package com.string;
import java.util.*;
import java.lang.*;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      	String s1=	sc.nextLine();
		//String s1="madam";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev)) {
			System.out.println("this is palindrome string");
		}
		else {
			System.out.println("not a palindrome string");
		}
	}

}
