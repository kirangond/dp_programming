package com.array.singlenumber;

import com.strings.reverse.interger.ReverseInterger;

public class ReturnDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {2,2,1};
        int distinctElement = distinctElement(arr);
        System.out.println("distinctElement: " + distinctElement);
	}

	private static int distinctElement(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					
					count ++;
					arr[i]=Integer.MIN_VALUE;
				}
			}
			if(count==1)
				return arr[i];
		}
		
		return 0;
	}

}
