package com.arrays;

public class swapthevalue {
	static void swap(int a,int b) {
	System.out.println("original values befor swap");
	System.out.println("a:" +a);
	System.out.println("b:" +b);
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println(" values after swap");
	System.out.println("a:" +a);
	System.out.println("b:" +b);
}

	
	
	

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=3;
		int[] arr= {1,2,3,4,5};
		swap(a,b);

	}

}

