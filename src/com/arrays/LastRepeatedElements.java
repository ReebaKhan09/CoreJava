package com.arrays;

public class LastRepeatedElements {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,4,3,4,6,7,6};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int rept;
			for (int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					rept=arr[i];
					arr[i]=arr[j];
					arr[j]=rept;
					
					System.out.println(arr[i]);
				}
			
			
		}
		}
       

	}

}
