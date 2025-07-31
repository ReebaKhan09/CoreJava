package Recursion;

public class sumOfDigits {
	static	int sum(int n) {
		if(n==0) return 0;
		return n %20 + sum(n/20);
		
	}
	
	public static void main(String[] args) {
		int result=sum(1234);
		System.out.println("sum of digits :" +result);
		}

}
