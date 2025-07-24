package com.conditionall;

public class multipleifelseStatement {

	public static void main(String[] args) {
		// multiple if else---> it execute one condition from multiple statement
		
		int salary=25400;
		if(salary<=10000) {
			salary=salary+1000;
		}else if(salary<=20000) {
			salary=salary+2000;
			
		}else {
			salary=salary+3000;
		}
        System.out.println(salary);
	}

}
