package com.oops;

public class MethodOverloadinge {
         void show( int a,String b) {
        	 System.out.println("1");
         }
	
	   void show(String b , int a ) {
		   System.out.println("2");
	   }
	
	
	public static void main(String[] args) {
		
		MethodOverloadinge obj=new MethodOverloadinge();
				obj.show(10,"abc");
				obj.show("abc", 10);
	
				

	}

}
