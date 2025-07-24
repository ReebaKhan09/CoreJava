package com.basic_number;
// ju bhi number khud se our 1 se puri tarha divide hoke reminder 0 deta hai wahi number prime number hota hai

public class PrimeNumber {

	public static void main(String[] args) {
		
    int no=7;     // for(int no=1,n0<=100,no++)   //for list of prime number
	int temp=0;
		
		for(int n=2;n<=100;n++) {
			if(no%n==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("number is prime "); //sout(no);
		}
		else {                                   // remove else statement
			System.out.println("number is not prime ");
				
			}
		}  
                 
		//list of prime number 1 to 100;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
