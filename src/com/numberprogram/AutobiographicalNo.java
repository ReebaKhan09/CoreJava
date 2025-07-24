package com.numberprogram;
import java.util.*;

public class AutobiographicalNo {

	public static void main(String[] args) {
	
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number you want to check");
       int n=sc.nextInt();
    //   boolean flag = false;
      int num;
       
       num=Math.abs(n);
       
        n=num;
       
      //the value() method return the string representation if int arguments
       String str=String.valueOf(num);
       
       //create array of digits
       int digitarr[] = new int [str.length()];
        for (int i=0;i<digitarr.length;i++) {
        	
          digitarr[i]=n%10;
         //remove the last digit
         
         n=n/10;
        	 
        }
        boolean flog=true;
         //inner loop compare the integer of the outer loop with each digit of the inner loop 
        //if they are equal then increment count of the digit
        
        for(int i=0;i<digitarr.length;i++) {
        	 int count=0;
        	   for(int j=0; j<digitarr.length;j++) {
        		    if(i==digitarr[i])
        		    	
        		    	count++;


        }
        	   if(count!=digitarr[i])
        	   {
        		boolean  flag=false;
        		    //break the execution if the condition becomes true
        		   break;
        		   
        		   
        	   }
       
	}
        if(flog) {
        	// print if the status return the
        	System.out.println(num+" is anautobiographical number");
        }
        else {
        	 //print if status return false 
        	
        	System.out.println(num+"is not a autobiographical number");
	}
	}}
