package com.strings.reverse.interger;

public class ReverseInterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//not valid for negative inputs
		int n = -123;
		int sum = 0;
		
//		while(n>0)
//		{
//		int  r =  n % 10;
//		sum = sum * 10 + r;
//		n = n/10;
//		}
//		System.out.println(sum);
		
		//valid for negative scenario but for long values it will not applicable
		while(n!=0)
		{
		int  r =  n % 10;
		sum = sum * 10 + r;
		n = n/10;
		}
//		System.out.println(sum);
		
		if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE)
			System.out.println(0);
		System.out.println(sum);
		

	}

}
