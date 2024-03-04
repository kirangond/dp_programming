package com.strings.reverse;

public class ReverseUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "kiran";
		
		StringBuilder stringBuilder = new StringBuilder(name);
		stringBuilder.reverse();
		
		String string = stringBuilder.toString();
		System.out.println("reverse string is: " + string);

	}

}
