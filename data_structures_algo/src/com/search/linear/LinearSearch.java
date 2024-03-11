package com.search.linear;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int arr [] = {3,5,6,2,1};
		int key = -1;
		boolean result = search(arr,key);
		if(result==true)
		{
			System.out.println("element is present: ");
		}
		else
		{
			System.out.println("element not present: ");
		}
	}

	private static boolean search(int[] arr, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return true;
			}
		}
		return false;
	}
}
