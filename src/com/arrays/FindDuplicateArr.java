package com.arrays;

public class FindDuplicateArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,3,4,6,3,4};
		int n=a.length;
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 if(a[i]==a[j]) {
						System.out.println("first duplicate elements is :" +a[i]);
					 }
	
			 }
			 
		 }
		 

	}

}
