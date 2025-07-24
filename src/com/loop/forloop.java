package com.loop;

import java.util.Scanner;
import java.util.*;

public class forloop {

	public static void main(String[] args) {
		// loop; loops used to iterate a part of program several times
		
		//1.forloop--> it is generally used when we know how many times loop will itrate
		
		//for(int num=1;num<=5;num++) {
		//	System.out.println("" +num);
	//	}
          
		
		// example;2 print number from 1 to n
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int num=1;num<=n;num++) {
			System.out.println(num);
		}
		
	}

}
