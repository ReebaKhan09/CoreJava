package com.conditionall;

import java.util.Scanner;

public class Switchcase {
     // calculator
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int no1=sc.nextInt();
	    System.out.println("Enter the number");
	    int no2=sc.nextInt();
	    System.out.println("select the symbole (+,-,*,/)" );
	    String sym=sc.next();
	    int res;
	    
	    switch (sym) {
	    
	    case "+":res=no1+no2;
	    System.out.println("Addition is :"+res);
	    break;
	    
	    case "-":res=no1-no2;
	    System.out.println("subtraction is :"+res);
        break;
        
	    case "*":res=no1*no2;
	    System.out.println("Multiplication is :"+res);
        break;
        
	    case "/":res=no1/no2;
	    System.out.println("division is :"+res);
         break;
         
        default:System.out.println("invalid Symbol");
	    }
	    
	    

	}



}
