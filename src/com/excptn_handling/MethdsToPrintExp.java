package com.excptn_handling;
import java.util.*;

public class MethdsToPrintExp {

	public static void main(String[] args) {
		/* methods to print exception
		 1.e.printStacktrace
		 2.sout(ae); sout(ae.tostring);
		 3.
		 */
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
      catch(ArithmeticException ae) {
    	  
    	// e.printStackTrace();
    	  System.out.println(ae);
    	  System.out.println(ae.toString());
    	  System.out.println(ae.getMessage());
      }
	}
		

	}


