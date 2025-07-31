package com.basic_number;

public class fibonicca {

	public static void main(String[] args) {
		// in  fibonacci series,next number is the sum of previous two number;
		
		//using for loops
	int f1=0;
	int s2=1;
	 
	for(int i=3;i<=10;i++) {
		int n=f1+s2;
		System.out.println("fibannici series " +n);
		f1=s2;
		s2=n;
	}
	
	}
	
	}
