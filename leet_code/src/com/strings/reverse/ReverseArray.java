package com.strings.reverse;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	
		
		char[] array = {'h','e','l','l','o'};
		
//		for(int i=array.length-1;i>=0;i--)
//		{
//			System.out.print(array[i]);
//		}
		
		int i=0;
		int j=array.length-1;
		
		while(i<j)
		{
			char temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}
		
		for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]);
		}
	}

}
