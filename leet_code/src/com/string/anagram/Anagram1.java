package com.string.anagram;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1=  "anagram";
         String s2= "naaargm";
         boolean result = isAnagram(s1,s2);
         System.out.println(result);
	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		
		if(s1.length()!=s2.length())
			return false;
		
		int charArray1[] = new int[256];
		
		
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			charArray1[c]++;
		}
		
		//decrement count from second string
		for(int i=0;i<s2.length();i++)
		{
			char c = s2.charAt(i);
			charArray1[c]--;
			
			if(charArray1[c]<0)
			{
				return false;
		    }
		}
		
		for(int i=0;i<charArray1.length;i++)
		{
			int count = charArray1[i];
			if(count!=0)
			{
				return false;
			}
		}
		
		return true;
	}

}
