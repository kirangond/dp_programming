package com.array.singlenumber;

import java.util.Arrays;

public class SingleNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,1,2,1,2,3,4};
		int count = 1;
		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		for(int i=0;i<arr.length;i++)
		{
			int inner_count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					inner_count++;
				}
			}
			if(inner_count==1)
			{
				count++;
			}
		}
		System.out.println("count: " + count);
		

	}

}
