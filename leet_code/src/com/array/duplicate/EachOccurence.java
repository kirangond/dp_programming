package com.array.duplicate;

public class EachOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {1,4,2,4,1};
        
        for(int i = 0;i<arr.length;i++)
        {
        	int count = 1;
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        			count++;
        	}
        	System.out.println("count of element: " + arr[i] + " is " + count);
        }
	}

}
