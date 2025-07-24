package com.oops;

import java.lang.invoke.StringConcatFactory;
//chaining constructors

public class Phone {
	
	String brand;
	int price;
	
	Phone(){
		this("unknown", 0);
		System.out.println(" default parameter");
	}
	
	Phone(String brand){
		this("brand",15000);
		System.out.println(" 1 parameter");
	}
	
   Phone(String brand,int price){
	   this.brand=brand;
	   this.price=price;
	   System.out.println(" 2 parameter :" +brand+ "," +price);
   }


	public static void main(String[] args) {
		 Phone p=new Phone();
	     Phone p1=new Phone("samsung");
	     Phone p2=new Phone("Iphone",80000);
	     

		
	}
}

