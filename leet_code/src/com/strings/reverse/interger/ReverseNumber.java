package com.strings.reverse.interger;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int x = 120;
           
           int sum = 0;
           
           while(x>0)
           {
        	   int r =  x % 10;
        	   sum = sum * 10 + r ;
        	   x = x / 10;
           }
           
           System.out.println("reverse number is: " + sum);
	}

}
