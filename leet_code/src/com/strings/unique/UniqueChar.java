package com.strings.unique;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "leetcode";
		char[] charArray = s.toCharArray();
		
//		for(int i=0;i<charArray.length;i++)
//		{
//			System.out.println(charArray[i]);
//		}
		
		int index = 0;
		for(int i=0;i<charArray.length;i++)
		{
			for(int j=i+1;j<charArray.length;j++)
			{
				if(charArray[i]!=charArray[j])
				{
					index = i;
					
				}
				break;
			}
		}
		
		System.out.println("index: " + index);

	}

}
