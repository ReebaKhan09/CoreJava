package com.numberprogram;

import java.util.Scanner;

public class NeonNoEX {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check");
         int n = sc.nextInt();
      
		int sum=0;
		int sqr;
		//int digit;
		sqr=n*n;
		while(sqr!=0) {
	
			int d=sqr%10;
			sum=sum+d;
			sqr=sqr/10;
			 
		}
		if(n==sum) {
			
			System.out.println(n+" is a neon number");
			
		}else {
			System.out.println(n+" is not a neon number");
		}
		
		
	}
	

}
