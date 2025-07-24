package com.basic_number;
import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		
		//factorialnumber e.g> 5!=5*4*3*2*1=120;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbe:");
        int no=sc.nextInt();
		
		//int no=5;
		int fact=1;
		
		for(int i=1;i<=no;i++){
	
			
			fact=fact*i;
		}
		System.out.println("factorial of "+no+ " is "+fact);

	}

}
