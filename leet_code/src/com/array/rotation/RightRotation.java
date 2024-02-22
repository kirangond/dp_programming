package com.array.rotation;

import java.util.Arrays;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int arr[] = {1,2,3,4,5,6,7}, k=3;
		int arr[]= {-1}, k=2;
		int n=arr.length;
		//create new temp array of original size
		int temp[] = new int[n];
		
		//copy elements of original array into the temp
		int d=0; //to track of current index
		if(n>k)
		{
		for(int i=n-k;i<n;i++)
		{
			temp[d]=arr[i];
			d++;
		}
		
		//copy original array left out in to temp array
		for(int i=0;i<n-k;i++)
		{
			temp[d]=arr[i];
			d++;
		}
		
		//copy all array elements into original array
		
		for(int i=0;i<n;i++)
		{
			arr[i]=temp[i];
		}
		
		//print in array format
		String string = Arrays.toString(arr);
		System.out.println(string);
		}
	}

}
