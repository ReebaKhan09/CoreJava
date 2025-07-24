package com.oops;

public class ThreeWaysToInitiObj {
	
	String color;
	int age;
	void initObj(String c,int a) {
		color=c;
		age=a;
	}
	void display() {
		System.out.println(color+" "+age);
	}
	public static void main(String[] args) {
		// by using reference variables
		/* ThreeWaysToInitiObj  buzo =new ThreeWaysToInitiObj();
		 buzo.color="black";
		 buzo.age=10;
		 System.out.println(buzo.color+ "  " +buzo.age);
		 */
		  
		// by using method
		 ThreeWaysToInitiObj  buzo =new ThreeWaysToInitiObj();
		 buzo.initObj("black",20);
		 buzo.display();

	}

}
