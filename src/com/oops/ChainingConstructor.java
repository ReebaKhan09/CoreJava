package com.oops;

import java.awt.DefaultFocusTraversalPolicy;

/* calling one constructor from another constructor within the same class,this help avoid duplicate
 and improves reusability
*/
public class ChainingConstructor {

     String name;
      int rollno;
  
    ChainingConstructor() { //1 constructor
    	this("unknown" , 0);
	  System.out.println("default constructor");
   }
    
    ChainingConstructor(String name) { //2 constructor
          this(name,47);
         System.out.println(" one parameterized constructor ");
    }
    ChainingConstructor(String name, int rollno) { //3 constructor
    	this.name=name;
    	this.rollno=rollno;
   	System.out.println("two parameters constructos:" +name + "," +rollno);
    	
    }
    void display() {
    	System.out.println("ChainingConstructor:" + name + ", rollno:" +rollno );
    }
    
	public static void main(String[] args) {
	
     ChainingConstructor Cc=  new ChainingConstructor();
     Cc.display();
       
	}

}
