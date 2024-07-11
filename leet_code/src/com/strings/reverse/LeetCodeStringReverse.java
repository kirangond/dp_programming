package com.strings.reverse;

import java.util.Arrays;

public class LeetCodeStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
		char[] newArray = reverse(s);
		System.out.println(Arrays.toString(newArray));
	}



	static char[]  reverse(char[] s) {
		// TODO Auto-generated method stub
		 int i = 0;
	        int j = s.length-1;
	        
	        while(i<j)
	        {

	            char temp = s[i];
	            s[i]=s[j];
	            s[j]=temp;
	            i++;
	            j--;
	            
	        }
		return s;
	}

}
