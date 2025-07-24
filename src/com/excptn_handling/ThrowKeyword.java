package com.excptn_handling;
import java.util.Scanner;

   //  (yougerAgeExeception)            
public class ThrowKeyword extends RuntimeException { // unchecked exception class
	
    public ThrowKeyword( String msg) {
		super(msg);
	}

	class voting{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age=sc.nextInt();
		if(age<18) {
			throw new ThrowKeyword("your are not eligible for voting");
		}else {
			System.out.println("you can vote successfull");
		}
		
	}
	}

}
