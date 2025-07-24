package com.string;


public class dupli {

	public static void main(String[] args) {
		String string="hello";
		char[] ch=string.toCharArray();
		System.out.println("dup char are ;" );
		for (int i=0;  i<ch.length; i++) {
			 
			for(int j= i+1 ; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
				}
			
			}
		}

	}

}
