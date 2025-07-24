package com.string;

import java.time.chrono.IsoChronology;

public class test {
	
    
	public static void main(String[] args) {
	
   int i=1;
   int digit=10;
   
     do {
    	 if(i%2 == 0) {
    		 System.out.println(i  + " is an even " );
    		 
    	 }
    	 else {
    		  System.out.println(i + " is an odd " );
    	 }
    	 i++;
 
	}while(i <= digit);
}
}