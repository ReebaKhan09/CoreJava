package com.arrays;

public class BubbleSortAlg {

	public static void main(String[] args) {
		int[] a= {35,78,19,45,5};
		int temp;
		 // for rounds
		for (int i=0;i<a.length;i++) {
			  int flog=0;
			for(int j=0;j<a.length-1-i;j++) {
				// compare the elements
				if(a[j]<a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flog=1;
					
				}
			}
			if(flog==0) {
				break;
			}
		}
		// print soted elements 
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
