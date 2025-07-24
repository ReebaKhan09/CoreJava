package com.arrays;

public class withoutSortmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {3,2,4,1,5};
    System.out.println("without using soted method ");
     for(int i=0; i<arr.length;i++) {
    	// int temp=0;
    	 for (int j=i+1;j<arr.length;j++) {
    		 int temp=0;
    		 if(arr[i]>arr[j]) {
    		temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
    	 }
    	
     }
    	 System.out.println(arr[i]+ " ");
	}
	}
}
