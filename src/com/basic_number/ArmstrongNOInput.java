package com.basic_number;
import java.util.Scanner;

public class ArmstrongNOInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		
		while(temp!=0) {
			int digit=temp%10; // last didgit nikame ke liye hai >>> 3
			sum+=digit*digit*digit;
			temp=temp/10; // 15
			
		}
		if(sum==sum) {
			System.out.println(num+ " is an armsttrong number");
		}else {
			System.out.println(num+ " is not an armstrong number");
		}
		

	}}
