package com.strings.reverse;

import java.util.Arrays;

public class ReverseCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char[] c = {'h','e','l','l','o'};	
      
      String str = String.valueOf(c);
      System.out.println("convert charcter array into string: " + str);
      for(int i=c.length-1;i>=0;i--)
      {
    	  System.out.print(c[i]);
      }
      
//      c.toString();
      System.out.println();
      System.out.println(Arrays.toString(c));
      
	}

}
