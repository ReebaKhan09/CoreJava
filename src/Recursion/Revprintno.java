package Recursion;

public class Revprintno {
	
	static void revprintno(int n1) {
		
		if(n1==0) return;
		
		System.out.println(n1);
		revprintno(n1-1);
		
	}

	public static void main(String[] args) {
		revprintno(20);

	}

}
