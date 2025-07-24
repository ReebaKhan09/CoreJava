package com.arrays;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] = {22,13,17,11,10,14,12};
		HeapSort hs=new HeapSort();
		hs.sort(arr);
		hs.printarr(arr);
	}

	void sort(int arr[]) {
		int leng=arr.length;
		for(int i=leng/2-1;i>=0;i--) {
			heapify(arr,leng,i);
		}
		//swap the elements and heapify again
		for(int i=leng-1;i>=0;i-- ) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	void heapify(int arr[],int n, int i) {
		int largest=i;
		int left=2*i+1 ;// left child index positions
	    int right=2*i+2; // right child index position
	    
	    if(left<n && arr[left]> arr[largest]) {
	    	largest=left;
	    }
	    if(right<n && arr[right]>arr[largest]) {
	    	largest=right;
	    }
	    if(largest!=i) {
	    	int temp=arr[i];
	    			arr[i]=arr[largest];
	    					arr[largest]=temp;
	    					heapify(arr,n,largest);
	    }
	}
	void printarr(int arr[]) {
		for(int i=0;i<arr.length; i++) {
			System.out.println(arr[i]+"");
		}
	}

}
