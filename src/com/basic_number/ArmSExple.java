package com.basic_number;

public class ArmSExple {
	    public static void main(String[] args) {
	        int num = 1634;// 153 > 1*1*1=1 5*5*5=125 3*3*3*=27  
	                              // 1+125+27 =  153 ==153
	        int count = 0;
	        int temp = num;

	        // Count digits
	        while(temp != 0){
	            temp = temp / 10; // 370 .. 37 ...7 0
	            count++; //1  2 3
	        }

	        // Calculate sum of powers  // temp 370
	       temp = num;
	        int sum = 0;
	        while(temp != 0){
	            int digit = temp % 10; //  0  // 7
	            sum += Math.pow(digit, count); // 0 3... 7 3
	            temp = temp / 10; // 37>>  0
	        }

	        // Check
	        if(sum == num){
	            System.out.println(num + " is an Armstrong number");
	        } else {
	            System.out.println(num + " is NOT an Armstrong number");
	        }
	    }
	}



