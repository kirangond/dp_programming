package com.array.rotation;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7},k=3;
		rotate(arr,k);

	}

	private static void rotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int n=arr.length;
		k=k%n;
		
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		
		   System.out.print("[");
		    for (int i = 0; i < n; i++) {
		        System.out.print(arr[i]);
		        if (i < n - 1)
		            System.out.print(",");
		    }
		    System.out.println("]");
		
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}
