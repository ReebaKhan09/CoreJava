 package com.string;

public class StringMethods {

	public static void main(String[] args) {
		//+ operater in string
		String s1="surname";
		String s2="khan";
		
		System.out.println(s1+s2);
		System.out.println(s2+20);
		System.out.println(s1+s2+17);
//		System.out.println(10+20-s1);
		System.out.println(s1+20*10);
		
		                              // concate method
		
		System.out.println(s1.concat(s2));
		
		                           
		                              // joind method --> static type method
		
		System.out.println(String.join(":", s1 , s2));
		
	                                      
		                             // subsquence method--return charsequence values
		
        String s="this is demo";  //begining index position // ending ind postion
		System.out.println(s.subSequence(3,9)); // s is d count also space
		
	                                     
		                               // substring method---->retune string value
		
		System.out.println(s.substring(3)); // s is demo
		System.out.println(s.substring(3,11)); // s is dem
		
		
                                      // replace method--> retunr string char
		
		String s3="this is demo";
		              //    old    new
		System.out.println(s3.replace("is" , "was"));// jaha jaha is hoga woh hatkar was hoga output->thwas was demo
		System.out.println(s3.replaceFirst("is", "was")); //jaha per fist time is milega wo wahi change hoga bas --thwas is demo
		System.out.println(s3.replaceAll("is", "was")); //
		System.out.println(s3.replaceAll("is(.)", "was")); // space remove kar dega
		System.out.println(s3.replaceAll("is(.*)", "was")); // was ke bad pure string remove kr dega
		
		
		                        // .equal method > return boolean
		
		
		
		
		
		
		
		
		

	}

}
