package com.arrays;

import java.util.Scanner;

public class ArrayManipulation {
	 static int findUnique(int[] arr) {
		 int n=arr.length;
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
			 if(arr[i]==arr[j]) {
				 arr[i]=-1;
				 arr[j]=-1;
			 }
		 }
		 }
		 int ans=-1;
		 for(int i=0;i<n;i++) {
			 if(arr[i]!=-1) {
				 ans=arr[i];
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
		System.out.println("unique elements:" +findUnique(arr));
		

	}

}
