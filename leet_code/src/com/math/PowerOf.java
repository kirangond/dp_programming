package com.math;

public class PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 27;
		
		boolean result=isPower(n);
	   if(result==true)
	   {
		   System.out.println("yes");
	   }else
	   {
		   System.out.println("no");
	   }

	}

	private static boolean isPower(int n) {
		// TODO Auto-generated method stub
		
		if(n<=0)
		{
			return false;
		}
		
		while(n%3==0)
		{
			n=n/3;
		}
		
		return n==1;
	}

}
