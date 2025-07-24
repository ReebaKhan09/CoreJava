package com.arrays;

public class SearchMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {4,3,2,1,6};
		int max=arr[0];
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]>max)
				 max=arr[i];
		 }
		 System.out.println("max value is " +max);
		

	}

}
