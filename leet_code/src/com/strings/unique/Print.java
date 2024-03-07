package com.strings.unique;

public class Print {

	public static int firstUnique(String s)
	{
		int[] array = new int[256];
        for (int i = 0; i < s.length(); i++) {
     	   char c = s.charAt(i);
     	   array[c]++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (array[s.charAt(i)] == 1) {
                return i;
            }
        }
        
        return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int result = firstUnique("leetcode");
           System.out.println(result);
           
           
	}

}
