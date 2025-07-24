package com.oops;

import Inheritance.main;
//chaining constructor

public class Car {

	String name;
	 int no;

	Car(){
		this("name",304);
		System.out.println("default");
	}
	
	
	Car(String name, int no){
		this.name=name;
		this.no=no;
		System.out.println("parameter");
	}
	
	public static void main(String[] args) {
		Car c= new  Car();
	}
	
}
