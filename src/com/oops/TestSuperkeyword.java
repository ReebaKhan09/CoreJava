package com.oops;
import java.util.*;
class Ani{
	String color="white";
	
}
class cat extends Animal{
	String color="black";
	void printcolor()
	{
	//	System.out.println(color);// print color of dog class
	//	System.out.println(super.color);// print color of animal class
	}
}

public class TestSuperkeyword {

	public static void main(String[] args) {
	  cat c=new cat();
	  c.printcolor();

	}

}
