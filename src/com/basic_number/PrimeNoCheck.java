package com.basic_number;

import java.util.Scanner;
public class PrimeNoCheck {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);  //7
			System.out.println("enter the number:"); //7 
			int a=sc.nextInt();
		
			int temp=0;
			
			for(int i=2; i<=a-1;i++) { 
				if(a%i==0) {
					temp=temp+1; //1
				}
				
			}
			if(temp>0) {
				System.out.println("not prime nnumber");
			}
			
			else {
				System.out.println("prime number");
			}
	}
		}