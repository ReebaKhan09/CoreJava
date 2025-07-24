package com.loop;

public class DWLoop {

	public static void main(String[] args) {
		for( int i=1; i<=10;i++) {
			System.out.println("hie");
			System.exit(i);
			if(i==2 || i==5 || i==10) {
				continue; 
			}
			System.out.println(i);
		}
	}

}
