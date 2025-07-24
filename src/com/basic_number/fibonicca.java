package com.basic_number;

public class fibonicca {

	public static void main(String[] args) {
		// in  fibonacci series,next number is the sum of previous two number;
		int n1=0,n2=1,n3,i = 0,count=10;
		System.out.println(n1+"" +n2);
		
		for(i=2;i<count;++i) {
			
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		
		}}

}
