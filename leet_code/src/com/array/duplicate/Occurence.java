package com.array.duplicate;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = {1,2,3,1};
          int count = 0,find=5;
          for(int i=0;i<arr.length;i++)
          {
        	  if(arr[i]==find)
        	  {
        		  count++;
        	  }
          }
          
          System.out.println("number of times occured: " + count);
	}

}
