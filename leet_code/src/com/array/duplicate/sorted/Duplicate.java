package com.array.duplicate.sorted;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		int new_arr[] = new int[arr.length],k=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				 new_arr[k]=arr[i];
				 k++;
			}
		}
		System.out.println("length: "  + new_arr.length);
		
		for(int i=0;i<new_arr.length;i++)
		{
			System.out.println(new_arr[i]);
		}

	}

}
