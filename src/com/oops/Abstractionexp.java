package com.oops;


abstract class vehical{
	abstract void start();
}

class car extends vehical{
	void start() {
		System.out.println("car stats with key");
	}
}
class scooter extends vehical {
	void start() {
		System.out.println("scooter starts with key");
	}
}
public class Abstractionexp {

	public static void main(String[] args) {
		car ob1=new car();
		ob1.start();
		scooter ob2=new scooter();
		ob2.start();
		

	}

}
