package com.basic_number;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
       System.out.println("enter the number: ");
		int no=sc.nextInt();
		
		//int no=767;
		int temp=no;
		int rev=0;
		int rem;
		
		while(temp!=0)
		{
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		
		if(no==rev) {
			
			System.out.println(no+" is palindrome number");
		}
		else {
			
			System.out.println(no+"is not a palindrome number");
		}

	}

}
