package com.arrays;

import java.util.Scanner;

public class TripletSum {
	static int tripletSum(int[] arr,int target) {
		int ans=0;
		int n=arr.length;
		for (int i=0;i<n;i++) { //first number
			for(int j=i+1;j<n;j++) { //second number
				for(int k=j+1;k<n;k++) { //third number
					if(arr[i]+arr[j]+arr[k]==target) {
						ans++;
					}
					
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		 
		System.out.println("enter"+n+" elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target sum");
		int target=sc.nextInt();
		System.out.println(tripletSum(arr,target));
		

	}

}
