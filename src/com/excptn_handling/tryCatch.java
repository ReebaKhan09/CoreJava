package com.excptn_handling;
import java.io.*;
import java.lang.ArithmeticException;

class tryCatch {

	public static void main(String[] args) {
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
      catch(Exception e) {
    	  
    	 System.out.println("you cannat divide by zero");
      }
	    System.out.println("hello");
	}

}
