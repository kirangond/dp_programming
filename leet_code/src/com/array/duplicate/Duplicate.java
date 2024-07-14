package com.array.duplicate;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {1,2,3,4};
         boolean result=duplicate(arr);
         System.out.println("result : " + result);
	}

	private static boolean duplicate(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
			{
				return true;
			}
		}
		return false;
	}

}
