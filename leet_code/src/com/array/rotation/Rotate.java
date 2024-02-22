package com.array.rotation;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5},d=2,n=5;
		System.out.println(arr.length);
		
		//print array elements
		
		for(int i=0;i<5;i++)
		{
			System.out.println("array elements in each iteration:"+arr[i]);
		}
		
		//print elements as array using in built function
		
		String string = Arrays.toString(arr);
		System.out.println("string: " + string);
		
		//prints elements of an array without converting into string
		System.out.print("Array elements: [");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]);
			if(i<arr.length-1)
			System.out.print(",");
		}
		
		 System.out.println("]");

////		 //1st approach copying array elements to one lower number of array
//		 int temp,k=2;
//		for(int i=0;i<5-2;i++)
//		{
//         	
//			arr[i]=arr[k+i];
////			if(i==5-1)
////			{
////				arr[5-1]=temp;
////			}
//			
//		}
		
//		String string1 = Arrays.toString(arr);
//		System.out.println("string1: " + string1);
		
		//2nd approach divide into 2 array
//		int newArray[]= new int[5]; //initial empty
//		for(int i=0;i<k;i++)
//		{
//			newArray[i]=arr[i];
//		}
//		String string2 = Arrays.toString(newArray);
//		System.out.println("string2: " + string2);
//		
		 //approach copy into temp array
		 //rotated using left concept implement for right as well
		 int temp[] = new int[5];
		 int k = 0;
          for(int i=d;i<n;i++)
          {
        	 temp[k]=arr[i];
        	 k++;
          }
          
          for(int i=0;i<d;i++)
          {
        	  temp[k]=arr[i];
        	  k++;
          }
          
          for(int i=0;i<n;i++)
          {
        	  arr[i]=temp[i];
          }
          
          for(int i=0;i<n;i++)
          {
        	  System.out.print(arr[i]+" ");
          }
		 
	}

}
