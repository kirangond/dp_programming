package com.strings.unique;

public class FirstUniqueChar {

    public static int firstUniqueChar(String s) {
        // Assuming ASCII characters (256 possible characters)
        int[] charCount = new int[256];

     // Count occurrences of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Increment the count of the current character in the charCount array
            charCount[c]++;
            
            // Alternatively, you can use the following if statement to check for non-alphanumeric characters:
            // if (Character.isLetterOrDigit(c)) {
            //     charCount[c]++;
            // }
            // This can be useful if you want to count only alphanumeric characters.
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i)] == 1) {
                return i;
            }
        }

        // If no non-repeating character is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(firstUniqueChar("leetcode"));        // Output: 0
        System.out.println(firstUniqueChar("loveleetcode"));    // Output: 2
        System.out.println(firstUniqueChar("aabb"));            // Output: -1
    }
}

