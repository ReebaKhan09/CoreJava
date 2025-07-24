package com.arrays;

public class sortedAraay {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] a= {1,0,0,1,0,1,1,0,0};
	       int n=a.length;
	    //   sorteZeroesAndOneInplace( a )
	       int left =0 , right=n-1; 
	       while(left<right) {
	      if(a[left]==1&& a[right]==0)
	    Swap(a, left, right);
	    	  left++;
	    	  right--;
	      }
	       if(a[left]==0) {
	    	   left++;
	    	   
	       } if(a[right]==1) {
	    	   right--;
	       }
		 System.out.println(a);
	

      
}

	private static void Swap(Object object, int left, int right) {
		// TODO Auto-generated method stub
		
	

	}
       

}


