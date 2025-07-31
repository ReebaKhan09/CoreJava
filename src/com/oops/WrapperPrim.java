package com.oops;

public class WrapperPrim {

	public static void main(String[] args) {
		
	//primitive var
	int a=10;// it is a primitive var whch stored in stack mem.
	System.out.println("primitive var:"+a);
	
	//reference obj
	Integer b=20; // autoboxing which is automatcally convert into objects which stored in heap mem.
	System.out.println("object" +a);
	  
	//manual boxing >>> valueOf
	Integer obj=Integer.valueOf(a); //manual boxing > primitive var convert to objs
	System.out.println(obj);
	
	
	//unboxing >>> IntValue
	Integer obj1=new Integer(20);
	int c=obj.intValue(); // manual unboxing > obj convert to primitive
	System.out.println(c);
	
	
	
	
	
	
	}

}
