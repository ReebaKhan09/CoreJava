package com.arrays;

public class LasgestElementsOfArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
int arr[]= {3,2,1,5,2};

 int largest=arr[0];
 
 
 for(int i=1;i<arr.length;i++)
 {
	 if( arr[i]> largest) {
		 System.out.println(arr[i]+" ");
	 }
 }


	}

}
