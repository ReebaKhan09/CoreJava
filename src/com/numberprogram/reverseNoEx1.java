package com.numberprogram;

public class reverseNoEx1 {

	public static void main(String[] args) {
		int no=234;
		int temp=no;
		int rev=0;
		//`int rem;
		
		for(;no!=0;no=no%10)
		{
		int rem=no%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("the reverse number is:" +no);

	}

}
