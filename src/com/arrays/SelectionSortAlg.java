package com.arrays;

public class SelectionSortAlg {

	public static void main(String[] args) {
	
		int[] a= {23,56,78,92,34,5};
		int temp=0;
		int min;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j+1]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		

	}

}
