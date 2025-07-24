package com.basic_number;

import java.util.concurrent.CountDownLatch;

public class primeN {


	public static void main(String[] args) {
	for(int i=2; i <=50;i++) {
	int	Count =0;
	
	      for(int j=1;j<=50; j++) {
		if(i%j==0) {
			Count++;
		}
	}
	      if(Count==2) {
	    	  System.out.println("primeN is :" +i);
	      }
	}
		

	}

}
