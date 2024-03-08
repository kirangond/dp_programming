package com.string.palindrome;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "Race: A cAr";
         //convert into lower case
//         System.out.println(s.toLowerCase());
         
         //remove white space and special character
         
        
        
      System.out.println(s.toLowerCase().replaceAll("[^a-z0-9]", ""));
         
        System.out.println(s);
	}

}
