package com.numberprogram;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
	int n=12345;
	int r=0;
	int rem;
	 while(n>0)
	 {
		rem= n%10;
		r=r*10+rem;
		n/=10;
	 }
	 System.out.println(r);
	}

}
