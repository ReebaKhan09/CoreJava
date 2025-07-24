package com.oops;
import java.util.*;
import java.lang.*;
import java.io.*;

public class MethodOverloading {
	
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static String sum(String x, String y) {
		return x+y;
	}

	public static void main(String[] args) {
		/*
		 1.same name of methods
		 2.same class
		 2.difference args
		 */
		System.out.println(sum(5,7));
		System.out.println(sum(5,7,8));
		System.out.println(sum("india","programmer"));


	}

}
