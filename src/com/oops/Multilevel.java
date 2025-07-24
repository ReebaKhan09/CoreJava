package com.oops;

class a{
	void methoda(){
		System.out.println("Method of A");
	}
}
class B extends a{
	void methodB(){
		System.out.println("Method of B");
	}

}
class C extends B{
	void methodC(){
		System.out.println("Method of C");
	}

}

public class Multilevel {

	public static void main(String[] args) {
    C obj=new C();
    obj.methodC();
    obj.methodB();
    obj.methoda();

	}

}
