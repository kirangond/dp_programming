package com.string.palindrome;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		String s = "race a car";
		String converted=s.toLowerCase().replaceAll("[^a-z0-9]", "");
		boolean palindrome = isPalindrome(converted);
		System.out.println(palindrome);
          
	}

	private static boolean isPalindrome(String converted) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = converted.length()-1;
		
		while(i<j)
		{
			if(converted.charAt(i)!=converted.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}


}
