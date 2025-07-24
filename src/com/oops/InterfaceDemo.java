package com.oops;
import java.util.*;
/*interface-->
 * *an interface can be used when we want to achieve 100% abstraction, on other hand ,actract classes can be used 
 * to anything between0-100% abtraction.
 * *an interface cannat have constructer becoz we cnnot create obj of an interface
 * *if you want a class o archieve multiple inheritance, there is only one way: interfaces
 * advantage of interface--> used to archive loose coupling
 
 */

 interface motor{
	public void start();
		
	}

 class ElectricCar implements motor {
	public void start() {
		System.out.println("Electric car start");
	}
}

 class DieselCar implements motor{
	 public void start() {
		 System.out.println("diesel car start");
	 }
 }


public class InterfaceDemo {

	public static void main(String[] args) {
		motor Tasla=new ElectricCar();
		motor XUN700=new DieselCar();
		Tasla.start();
		XUN700.start();

	}

}
