package com.oops;

public class Animal {

	
		/* what is class?
  -->  class is the collection of objects
	class is not a real world entity ,its just a templet or blueprint or prototype
	class does not occupy memory 
   */
		
	/* what is method?
-->	 method is a set of codes which performs particular task
	 *Advantage-> 1.code reusalibility 2.code optimization
	 syntax-> a-m return-type method-name(list of parameter);
*/
		/*what is object?
	--> objectis an intance of class 
	obj is real world entity
	obj occupies memory	
	syntax--> class_name obj_name = new class_name(); through obj  we can call methods-> obj-name.run();
	            Animal    buze    = new Animal()    ;                                     buzo.run();
 */
	      public void eat() {
	    	  System.out.println("i am eating");
	      }

		public static void main(String[] args) {
 
		System.out.println("1");
		Animal buzo=new Animal();
		buzo.eat();
		buzo.run();
		Birds sp=new Birds();
		sp.fly();
	}
    public void run() {
    	System.out.println("i am running");
    }
    
}
class Birds{
	void fly() {
		System.out.println("i am flying");
	}
}