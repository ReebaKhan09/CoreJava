package com.basic_number;

public class RandomNOEX1 {

	public static void main(String[] args) {
		int min=200;
		int max=400;
		//generate random double value from 200 to 400
		
		System.out.println("random value of type int between"+min+"to "+max+":");
		
		double a=Math.random()*(max-min+1)+min;
		System.out.println("Ramdom value of type int between"+min+" to "+max+":");
  int b =(int)(Math.random()*(max-min+1)+min);
    System.out.println(b);
	}

}
