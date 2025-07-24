package com.numberprogram;

import java.util.Scanner;

public class SpyNoEx {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		int product=1;
		int lastdigit;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number to check");
		  n=sc.nextInt();
		   while(n> 0) {
			    lastdigit= n%10;
			     sum=sum=lastdigit;
			      product=product*lastdigit;
			       n=n/10;
			       
		   }
		 if(sum==product) {
			 System.out.println("the given number is a spy number");
		 }
			 else {
				 System.out.println("the given number is not a spy number");
			 }

	}
		 }
	
