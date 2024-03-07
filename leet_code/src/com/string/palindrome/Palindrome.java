package com.string.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		boolean isPaliNode = palindrome("madam");
		System.out.println("is palindrome: " + isPaliNode);
	}

	private static boolean palindrome(String s) {
		// TODO Auto-generated method stub
		char[] charArray = new char[s.length()];
		int currChar = 0;
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 charArray[currChar]=s.charAt(i);
			 currChar++;
		 }
		 
		 //wrong comparision
//		 if(charArray.toString()==s)
//		return true;
//		 return false;
		 
		
		 
		 return new String(charArray).equals(s);
	}

}
