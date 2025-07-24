package com.oops;
import java.util.*;
class vehical{           // parent class or super class
	double price;
	double mileage;
	String color;
	
	void display() {
		System.out.println("price");
		System.out.println("milaeg");
		System.out.println("color");
	   

	}

	
}
class car extends vehical{   // child class or subclass
	String ftype;
	boolean sunroof;
	String brand;
}
public class Inheritence {

	public static void main(String[] args) {
	
		car car1=new car();
		car1.brand="suzuki";
		car1.price=1500000;
		car1.mileage=18.3;
		car1.ftype="Diesel";
		car1.color="red";
		car1.sunroof=true;
		car1.display();
		System.out.println(car1.sunroof);
		

	}

}
