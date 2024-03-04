package com.strings.reverse;

import java.util.Arrays;

public class ReverseArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"h","e","l","l","o"};
		// Convert the array to StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : s) {
            stringBuilder.append(str);
        }

        // Use the reverse() method to reverse the content
        stringBuilder.reverse();

        // Convert the StringBuilder back to String
        String reversedString = stringBuilder.toString();

        // Convert the reversed string to an array of characters
        String[] reversedArray = reversedString.split("");

        // Print the original and reversed arrays
        System.out.println("Original: " + Arrays.toString(s));
        System.out.println("Reversed: " + Arrays.toString(reversedArray));
	}

}
