package com.oops;
// composition has a relationship pen class dependent on student class

class pen{
	String color="blue";
	
	void write() {
		System.out.println("writting with " + color + " pen");
	}
}

class Student{
	pen pen =new pen();
	
	void Dohm() {
		System.out.println("stud is doing hm");
		pen.write();
	}
}

public class CompositionHR {
	public static void main(String[] args) {
	Student std=new Student();
	std.Dohm();

	}

}
