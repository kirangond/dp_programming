package com.search.linear;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,5,8,12,16,23,38,56,72,91};
		int key = 23;
		int low = 0;
		int high = arr.length-1;
		
		
		boolean result = binarySearch(arr,key,low,high);
		if(result==true)
		{
			System.out.println("element is present: ");
		}
		else
		{
			System.out.println("element not present: ");
		}
	}

	private static boolean binarySearch(int[] arr, int key, int low, int high) {
		// TODO Auto-generated method stub
		
		while(low<=high)
		{
			int mid = low + (high-low) / 2;
		   if(arr[mid]==key)
		   {
			   return true;
		   }
		   else if(key<arr[mid])
		   {
			   high = mid-1;
			
			   
		   }
		   else
		   {
			  low = mid + 1; 
		   }
		}  
		return false;
	}

}
