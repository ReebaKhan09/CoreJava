package com.basic_number;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		//int no=123;
		int t1=no;
      int length=0;
		//find length of digit
		while(t1!=0) {
			
			t1=t1/10;
			length=length+1;
		}
		//rev no
		int t2=no;
		int rem;
		int arm=0;
		//int multi=1;
		
		while(t2!=0) {
			
			int multi=1;
			rem=t2%10;
			
			for(int i=1;i<=length;i++) {
				
				multi=multi*rem;
				
			}
			arm=arm+multi;
			t2=t2/10;
		}
		if(arm==no) {
			System.out.println(no+ "is  a armstrong number");
		}
		else {
			System.out.println(no+ " is not a armstrong number");
		}
	

	}}
