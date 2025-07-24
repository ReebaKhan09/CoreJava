package com.oops;


interface in{
	public void run();
}

interface E{
	public void run();
}
class F implements in,E {
	public void run() {
		System.out.println("c class run method");
	}

}
public class Multiple {

	public static void main(String[] args) {
		/*1.  what is multiple inheritance?
		 in multiple inheritance, one child class and two parents class and java doesnt support directly
		 multiple inheritance, using interface we can achieve multiple inheritance
		2. whY ML is nor direclty possible in java?
		 becoz of multiplr inheritance create ambigaity in code, if ambigaity created in code then compiler deost
		 compile 
		 diamond problem- in multiple , jab multiple inheri ko  archieve krte wqt ju prolm aati h usse diamond
		 prolm
		 */
		F obj=new F();
		obj.run();

	}

}
