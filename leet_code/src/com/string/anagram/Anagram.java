package com.string.anagram;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String s =  "anagram";
             
             isAnagram(s);
	}

	private static void isAnagram(String s) {
		// TODO Auto-generated method stub
		
		int[] charArray = new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			charArray[c]++;
		}
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);

			  if (charArray[c] > 0) {
	                System.out.println(c + " = " + charArray[c]);
	                charArray[c] = 0; // Reset the count after printing
	            }
		}
		
//		for(int i=0;i<charArray.length-1;i++)
//		{
//			System.out.println(charArray[s.charAt(i)]);
//		}
		
		
	}

}
