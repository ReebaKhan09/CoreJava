package com.oops;
class test{
	void show(int a, String s) {
		System.out.println("1");
	}
}

 class MethodOverriding extends test {
	void show (int a, String s1) {
		System.out.println("2");
	}

	public static void main(String[] args) {
	test obj=new test();
	obj.show(1,"reeba");
	MethodOverriding obj1=new MethodOverriding();
	obj1.show(2,"khan");
	

	}

}
