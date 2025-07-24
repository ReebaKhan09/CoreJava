package com.string;

public class SearchingCharacters {

	public static void main(String[] args) {
		
		
		                         // indexOf method---> retune index position
		String s4="riba";
		System.out.println(s4.indexOf('i')); //  1
		System.out.println(s4.indexOf("riba"));// return string values also
                                 
		                        //lastindexOf() method --> last index position return last se search krna start krta h
		
		System.out.println(s4.lastIndexOf('b'));
		System.out.println(s4.lastIndexOf("ba"));
		
		
		                      // CharAt() method--> return character
		System.out.println(s4.charAt(3));
		
		
		                      // contains() method--> search the seqeunce of  character in the given string,it returns boolean vlues
		                      // present or not if present return true or if not present then return false
		System.out.println(s4.contains("ib"));
		
		                    // StartWitn() method--> return boolan values
		System.out.println(s4.startsWith("ri"));

		
		                       // endWith() method---> return booleans values
		System.out.println(s4.endsWith("a"));
		
		
		                      //   **CASE CONVERSION_METHODS**//
		//toupperCase method--> convert all character of the string into a uppercase letter
		//tolowerCase Method--> convert all characterof the string into a lowercase letter
		String s5="khan"; 
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		
		                         // **TYPE CONVERSION_methods** //
		//valueOf() method is static method --> convert different type of values into string
	
		String s="reeba";
		int a=10;
		String s1= String.valueOf(a);
		System.out.println(s);
		
		//tocharArray() method--> character array mai convert kara deta hai 
		                  // convert the given string into a sequence of character and return array length
		char[] c=s.toCharArray();
        System.out.println(c);
		
		
		

	}
	

}
