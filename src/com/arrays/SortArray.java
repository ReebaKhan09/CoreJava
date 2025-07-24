package com.arrays;
import java.lang.reflect.Array;
import java.util.Arrays;


public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[]= new int[] {3,2,4,1,5};
		//int array[]= {3,2,4,1,5};
         // original values of array
   Arrays.sort(array);
		
        System.out.println("elements of array  sorting in  accending order");
         for(int i=0;i<array.length;i++) {
        	 
        	
        	 System.out.println(array[i]+ "");
        	
         }
	}

}
