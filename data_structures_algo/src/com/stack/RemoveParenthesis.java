package com.stack;

import java.util.Stack;

public class RemoveParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "";
		boolean result = checkParenthesis(s);
		System.out.println(result);
}

	private static boolean checkParenthesis(String s) {
		// TODO Auto-generated method stub
		
		//assumed only 3 character present (, { and [ if other it will fail understand condition
		//(- 0  { - 1 [ -2 
		int charArray[] = new int [3];
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			
			if(c=='(' || c=='{' || c=='[' )
			{
				if(c=='(')
				charArray[0]++;
				else if(c=='{')
				charArray[1]++;
				else
				 charArray[2]++;
			}else if(c==')' || c=='}' || c==']')
			{
				if(c==')')
				{
					if(charArray[0]==0)
						return false;
					charArray[0]--;
				}
			else if(c=='}')
			{
				if(charArray[1]==0)
					return false;
				charArray[1]--;
			}
			else 
			{
				if(charArray[2]==0)
					return false;
				charArray[2]--;
			}
			
		}else
		{
			return false;
		}
		
		}
		
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]!=0)
			{
				return false;
			}
		}
		
		return true;
	}
}