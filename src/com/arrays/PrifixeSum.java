package com.arrays;

import java.util.Scanner;

public class PrifixeSum {
 static void PrintArray1(int[] arr) {}

	static int[] makepreFixSumArrya(int[] arr) {
		int n=arr.length;
		int[] pref=new int[n];
		pref[0]=arr[0];
		for(int i=0;i<n;i++) {
			arr[i]=arr[i-1]+arr[i];
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int[] arr =new int[n];
		
		System.out.println("Enter" +n+ "elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
        System.out.println("input arrays");
        PrintArray1(arr);
        int[] pref=makePreixSumArray(arr);
        PrintArray(pref);

	}

static int[] makePreixSumArray(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

static void PrintArray(int[] pref) {}

}
