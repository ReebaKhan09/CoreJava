package com.arrays;

public class SwapWithoutUsingTemp {
	static void swap(int a, int b) {
		System.out.println("original values before swap:"+a);
		System.out.println("original values before swap:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("values after sawp without using temp variable:");
		System.out.println("original values before swap:"+a);
		System.out.println("original values before swap:"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=3;
		int[] arr= {5,3,4,2,1};
		swap(a,b);

	}

}
