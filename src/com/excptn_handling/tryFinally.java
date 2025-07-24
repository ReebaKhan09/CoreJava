package com.excptn_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tryFinally {

	public static void main(String[] args) throws IOException {
		//i mantain clean up code i.e closing the resources
		// finally is the block that is always execute wethere exception is handle or not
		
		/*
		 if exception occure  in try-->catch ---->execute finally
		 if exception does not occure----> try----direct--->finally
		 */
		
	/*	try {
			int a=100,b=2,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
       finally {
    	   System.out.println("im in finally block");
       } */
		
		FileInputStream fis=null;
		try {
			fis =new FileInputStream("d:/abc.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
		finally {
			// cleanup here
			if(fis!=null) {
				fis.close();
				
			}
			System.out.println("file closed");
		}
	}

}
