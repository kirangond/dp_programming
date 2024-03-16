package com.others;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1};
		int result=missingNumber(arr);
		System.out.println(result);

	}

	private static int missingNumber(int[] arr) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		
		int[] newArray = new int [arr.length+1];
		   
		for(int i=0;i<arr.length;i++)
		{
			newArray[i]=arr[i];
		}
		
		int i = 0;
		for(i=0;i<newArray.length+1;i++)
		{
			if(i!=newArray[i])
			{
				return i;
			}
		}
		return 0;
	}

}
