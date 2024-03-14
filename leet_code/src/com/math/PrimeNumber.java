package com.math;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		boolean prime = isPrime(x);
		System.out.println("number : " + x + " is prime: " + prime );

	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		
		if(num<2)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
