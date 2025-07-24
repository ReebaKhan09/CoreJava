package com.oops;

class p{
	public void printp() {
		System.out.println(" class P method");
	}
}

class Q extends p{

	public void printQ() {
		System.out.println(" class Q method");
	}
}
class R extends Q{
	public void printR() {
		System.out.println("class R method");
	}
}

public class Hiererchicalinheritance {

	public static void main(String[] args) {
		Q obj=new Q();
		obj.printQ();
		obj.printp();
		R obj2 =new R();
		obj2.printR();
		
		

	}

}
