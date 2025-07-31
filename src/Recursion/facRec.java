package Recursion;

public class facRec {
	
	static int facRec(int n) {
		if(n==1) return 1;
		
		return n* facRec(n-1);
		
	}

	public static void main(String[] args) {
		int result= facRec(5);
		System.out.println(result);
		

	}

}
