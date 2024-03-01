package com.array.plus.one;

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;
            
            // If the digit becomes 10, set it to 0 and carry over to the next digit
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // If no carry, break the loop
                break;
            }
        }
        
        // If the leftmost digit also became 0 after carrying, we need to add a new digit
        if (digits[0] == 0) {
            int[] result = new int[n + 1];
            result[0] = 1; // Set the new leftmost digit to 1
            return result;
        }
        
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.println(Arrays.toString(result1));

        int[] digits2 = {9};
        int[] result2 = solution.plusOne(digits2);
        System.out.println(Arrays.toString(result2));
    }
}

