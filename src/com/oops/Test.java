package com.oops;

public class Test {
	//---> default constructor (compiler create);
/*	int i;
	String s;
	*/
	
	//--->no arg constructor (user create);
	/* int i;
	String s;
	*/
	Test(int a){
		System.out.println("no arg constructer"); //(paramitrized consructer);
	}
	
	
	public static void main(String[] args) {
		/* used of constructer--> to initialize an object
		--> 
*/
		Test t=new Test(10);
		
	//	System.out.println(t.i+"\n"+t.s);
		
	}
}
